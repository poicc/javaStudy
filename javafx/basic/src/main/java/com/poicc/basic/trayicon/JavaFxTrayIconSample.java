package com.poicc.basic.trayicon;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: JavaFx系统托盘
 * @author: crq
 * @create: 2021-10-25 20:13
 **/
public class JavaFxTrayIconSample extends Application {

    /**
     * 托盘图标
     */
    private static final String ICON_IMAGE = "https://cdn.jsdelivr.net/gh/poicc/image@main/1F984.1k1il3j4wrz.png";
    private Stage stage;

    /**
     * 创建线程池 不要Timer,Executors
     */
    ScheduledThreadPoolExecutor scheduled = new ScheduledThreadPoolExecutor(2);

    private final DateFormat dateFormat = SimpleDateFormat.getTimeInstance();

    @Override
    public void start(final Stage stage) throws Exception {
        this.stage = stage;
        //    指示JavaFx系统在最后一个应用程序窗口关闭时，不隐式退出
        Platform.setImplicitExit(false);
        //    设置托盘图标
        javax.swing.SwingUtilities.invokeLater(this::addAppToTray);
        //    stage透明的风格
        stage.initStyle(StageStyle.TRANSPARENT);
        //    创建布局，设置样式
        StackPane layout = new StackPane(createContent());
        layout.setStyle("-fx-background-color: rgba(255,255,255,0.5)");
        layout.setPrefSize(300, 200);
        //    点击应用程序屏幕时，这个虚拟的应用程序会隐藏自己
        layout.setOnMouseClicked(mouseEvent -> stage.hide());
        Scene scene = new Scene(layout);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);

    }


    /**
     * 对于这个虚拟应用 jfx场景图内容是hello world
     * 真正的应用可能会加载一个FXML
     * @return 主窗口程序内容
     */
    private Node createContent() {
        Label hello = new Label("hello world");
        hello.setStyle("-fx-font-size: 40px;-fx-text-fill: #238285");
        Label instructions = new Label("(click to hide)");
        instructions.setStyle("-fx-font-size: 24px;-fx-text-fill: #a06cc9;-fx-cursor: hand;");
        VBox content = new VBox(10,hello,instructions);
        content.setAlignment(Pos.CENTER);
        return content;
    }

    private void addAppToTray() {
        //    确保awt工具箱已初始化
        java.awt.Toolkit.getDefaultToolkit();
        //应用程序需要系统托盘支持，没有支持就退出
        if (!java.awt.SystemTray.isSupported()) {
            System.out.println("不支持系统托盘，应用程序退出");
            Platform.exit();
        }

        //设置托盘图标
        java.awt.SystemTray tray = java.awt.SystemTray.getSystemTray();
        URL iconImage = null;
        try {
            iconImage = new URL(ICON_IMAGE);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Image image = null;
        try {
            image = ImageIO.read(Objects.requireNonNull(iconImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
        java.awt.TrayIcon trayIcon = new java.awt.TrayIcon(Objects.requireNonNull(image));
        //如果用户双击托盘图标，则显示主应用程序窗体
        trayIcon.addActionListener(e -> Platform.runLater(this::showStage));
        //如果用户选择默认菜单项，显示主应用程序窗体
        java.awt.MenuItem openItem = new java.awt.MenuItem("hello world");
        openItem.addActionListener(e -> Platform.runLater(this::showStage));
        //要真正退出应用程序，必须转到系统托盘图标去点击Exit菜单
        java.awt.MenuItem exitItem = new java.awt.MenuItem("Exit");
        //关闭JavaFx应用程序，停止线程任务，移除托盘图标
        exitItem.addActionListener(event -> {
            scheduled.shutdown();
            Platform.exit();
            tray.remove(trayIcon);
        });
        //为应用程序设置弹出式菜单
        final java.awt.PopupMenu popup = new java.awt.PopupMenu();
        popup.add(openItem);
        popup.addSeparator();
        popup.add(exitItem);
        trayIcon.setPopupMenu(popup);

        //执行定时任务
        scheduled.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                javax.swing.SwingUtilities.invokeLater(() ->
                        trayIcon.displayMessage("hello", "This time is now" + dateFormat.format(new Date()),
                                TrayIcon.MessageType.INFO)
                );
            }
        }, 0, 3000, TimeUnit.MILLISECONDS);

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("Unbale to init system tray");
            e.printStackTrace();
        }

    }

    /**
     * 让应用程序置顶
     */
    public void showStage() {
        if(stage != null) {
            stage.show();
            stage.toFront();
        }
    }

    public static void main(String[] args){
        launch(args);
    }

}
