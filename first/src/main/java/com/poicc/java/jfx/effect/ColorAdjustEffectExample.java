package com.poicc.java.jfx.effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * @description: 颜色效果
 * @author: crq
 * @create: 2021-10-07 20:01
 **/
public class ColorAdjustEffectExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image("https://cdn.jsdelivr.net/gh/1802343228/image@main/avatar.3sylmzwhoqi0.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(70);
        imageView.setFitWidth(400);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);
        ColorAdjust colorAdjust = new ColorAdjust();
        //颜色的对比度
        colorAdjust.setContrast(0.4);
        //颜色的色调
        colorAdjust.setHue(-0.05);
        //亮度
        colorAdjust.setBrightness(0.9);
        //饱和度
        colorAdjust.setSaturation(0.8);
        imageView.setEffect(colorAdjust);
        Group root = new Group(imageView);
        Scene scene = new Scene(root,400,300);
        stage.setTitle("Color Adjuest effect example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
