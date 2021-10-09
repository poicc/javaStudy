package com.poicc.java.jfx;

import com.poicc.java.jfx.config.AppConfig;
import com.poicc.java.jfx.model.Person;
import com.poicc.java.jfx.view.PersonCtrl;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @description: 启动主类
 * @author: crq
 * @create: 2021-09-30 22:31
 **/
public class App extends Application {
    /**
     * 响应式列表
     */
    private final ObservableList<Person> personData = FXCollections.observableArrayList();

    public App() {
        personData.add(new Person("王林", "软件2026", "男", "江苏南京",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img10.jpg")));
        personData.add(new Person("彭海洋", "软件2026", "男", "江苏扬州",
                LocalDate.of(1999, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img11.jpg")));
        personData.add(new Person("郭佳", "软件2026", "女", "江苏苏州",
                LocalDate.of(2001, 11, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img12.jpg")));
        personData.add(new Person("黄志伟", "软件2026", "男", "江苏泰州",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img13.jpg")));
        personData.add(new Person("张珂", "软件2026", "女", "江苏徐州",
                LocalDate.of(2001, 9, 11), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img14.jpg")));
        personData.add(new Person("赵丹", "软件2036", "女", "江苏南通",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img15.jpg")));
        personData.add(new Person("张建凤", "软件2036", "女", "江苏无锡",
                LocalDate.of(2001, 2, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img16.jpg")));
        personData.add(new Person("杨阳", "软件1851", "男", "江苏南京",
                LocalDate.of(2000, 10, 23), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img17.jpg")));
        personData.add(new Person("尚宇驰", "软件1851", "女", "江苏徐州",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img20.jpg")));
        personData.add(new Person("陈蓉琪", "软件1851", "女", "江苏南京",
                LocalDate.of(2000, 3, 21), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img19.jpg")));
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("view/person.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 980, 600);
        stage.setTitle("AddressBook");
        stage.setScene(scene);
        stage.setResizable(AppConfig.stageResizable);
        stage.getIcons().add(new Image(Objects.requireNonNull(App.class.getResourceAsStream(AppConfig.icon))));
        PersonCtrl controller = fxmlLoader.getController();
        controller.setApp(this);
        stage.show();
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    public static void main(String[] args) {
        AppConfig.init();
        launch();
    }
}
