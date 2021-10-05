package com.poicc.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * @description: 流式布局
 * @author: crq
 * @create: 2021-10-05 22:57
 **/
public class FlowPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");

        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(25);
        FlowPane.setMargin(button1,new Insets(20,0,20,20));
        flowPane.getChildren().addAll(button1,button2,button3,button4);

        Scene scene = new Scene(flowPane,400,300);
        stage.setTitle("Flow Pane Demo");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
