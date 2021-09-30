package com.poicc.java.jfx;

import com.poicc.java.jfx.config.AppConfig;
import com.poicc.java.jfx.ctrl.Word;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/**
 * @description: 启动主类
 * @author: crq
 * @create: 2021-09-30 22:31
 **/
public class App extends Application {
    public Word word = new Word();
    @Override
    public void start(Stage stage) throws IOException {
        // 加载并创建主场景
        Parent root = FXMLLoader.load(Objects.requireNonNull(App.class.getResource("fxml/main.fxml")));
        // 加载外部样式，这样窗口中所有组件可用，绑定在fxml组件上的样式只能本组件可用
        root.getStylesheets().add(Objects.requireNonNull(App.class.getResource("css/main.css")).toExternalForm());
        Scene scene = new Scene(root, AppConfig.stageWidth, AppConfig.stageHeight);
        // 设置窗口信息
        stage.setTitle(AppConfig.title);
        //是否允许调整窗口尺寸
        stage.setResizable(AppConfig.stageResizable);
        //设置窗口透明度 默认为1
        stage.setOpacity(1);
        stage.getIcons().add(new Image(Objects.requireNonNull(App.class.getResourceAsStream(AppConfig.icon))));
        stage.setScene(scene);
        //设置窗口无边框
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

        TextField input = (TextField) root.lookup("#input");
        ListView<String> listView = (ListView<String>) root.lookup("#listView");

        //给输入框添加监听
        input.textProperty().addListener((observable,oldValue,newValue) -> {
            //获取到输入的内容
            String trim = newValue.trim();
            if(trim.length() > 0) {
                //调用Word的数据过滤方法
                List<String> searchResult = Word.search(trim,word.words,String::contains);
                listView.getItems().clear();
                listView.getItems().addAll(searchResult);
            }
        });


    }

    public static void main(String[] args) {
        AppConfig.init();
        launch();
    }
}
