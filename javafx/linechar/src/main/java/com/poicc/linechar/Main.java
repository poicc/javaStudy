package com.poicc.linechar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


/**
 * @author crq
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        Scene scene = new Scene(root, 800, 500);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        controller.setStage(primaryStage);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}