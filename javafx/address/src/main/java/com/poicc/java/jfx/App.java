package com.poicc.java.jfx;

import com.poicc.java.jfx.config.AppConfig;
import com.poicc.java.jfx.model.Person;
import com.poicc.java.jfx.view.BirthdayStatisticsController;
import com.poicc.java.jfx.view.PersonCtrl;
import com.poicc.java.jfx.view.PersonEditController;
import com.poicc.java.jfx.view.RootController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
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

    public Stage getStage() {
        return stage;
    }

    private Stage stage;
    private BorderPane rootLayout;

    public App() {
        personData.add(new Person("王林", "软件2026", "男", "江苏南京",
                LocalDate.of(2000, 10, 24), new Image("https://images.unsplash.com/photo-1631119462612-ea11c35016ba?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDM2NQ&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("彭海洋", "软件2026", "男", "江苏扬州",
                LocalDate.of(1999, 10, 24), new Image("https://images.unsplash.com/photo-1631142260263-f06f56741a58?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDM4OA&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("郭佳", "软件2026", "女", "江苏苏州",
                LocalDate.of(2001, 11, 24), new Image("https://images.unsplash.com/photo-1633287838491-3c4ef7e643bd?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDM5OQ&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("黄志伟", "软件2026", "男", "江苏泰州",
                LocalDate.of(2000, 10, 24), new Image("https://images.unsplash.com/photo-1631347532127-0fc06cd32c62?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDQxMA&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("张珂", "软件2026", "女", "江苏徐州",
                LocalDate.of(2001, 9, 11), new Image("https://images.unsplash.com/photo-1631887271692-506d6d5d8e5b?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDQyNA&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("赵丹", "软件2036", "女", "江苏南通",
                LocalDate.of(2000, 10, 24), new Image("https://images.unsplash.com/photo-1633334889899-35d144cdfd8c?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDQzNw&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("张建凤", "软件2036", "女", "江苏无锡",
                LocalDate.of(2001, 2, 24), new Image("https://images.unsplash.com/photo-1632059368252-be6d65abc4e2?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDQ0OQ&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("杨阳", "软件1851", "男", "江苏南京",
                LocalDate.of(2000, 10, 23), new Image("https://images.unsplash.com/photo-1631339960096-b4a035ed463d?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDQ1Nw&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("尚宇驰", "软件1851", "女", "江苏徐州",
                LocalDate.of(2000, 10, 24), new Image("https://images.unsplash.com/photo-1633357442438-db170a7ab02b?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDQ3OQ&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("陈蓉琪", "软件1851", "女", "江苏南京",
                LocalDate.of(2000, 2, 15), new Image("https://images.unsplash.com/photo-1632772196297-39ab1598668a?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzgwNDQ5NA&ixlib=rb-1.2.1&q=80&w=300")));
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        this.stage.getIcons().add(new Image(Objects.requireNonNull(App.class.getResourceAsStream(AppConfig.icon))));
        stage.setTitle("AddressBook");
        initRootLayout();
        showPerson();
    }

    public void showPerson() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("view/person.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            rootLayout.setCenter(anchorPane);
            PersonCtrl ctrl = fxmlLoader.getController();
            ctrl.setApp(this);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initRootLayout() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("view/root-layout.fxml"));
            rootLayout = fxmlLoader.load();
            RootController rootController = fxmlLoader.getController();
            rootController.setApp(this);
            //创建以根布局为内容的场景
            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().add(Objects.requireNonNull(App.class.getResource("css/style.css")).toExternalForm());
            //主窗体加入根布局
            stage.setScene(scene);
            stage.setResizable(AppConfig.stageResizable);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    public void showEditPerson(Person person,String type) {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("view/person-edit.fxml"));
            AnchorPane anchorPane = loader.load();
            //根布局中间部分加入人员编辑面板
            rootLayout.setCenter(anchorPane);
            //获取PersonEditController控制器
            PersonEditController controller = loader.getController();
            controller.setArgs(person,type);
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBirthdayStatistics(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("view/birthday-statistics.fxml"));
            AnchorPane anchorPane = loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Birthday Statistics");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(stage);
            Scene scene = new Scene(anchorPane);
            dialogStage.setScene(scene);
            BirthdayStatisticsController controller = loader.getController();
            controller.setPersonData(personData);
            dialogStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
