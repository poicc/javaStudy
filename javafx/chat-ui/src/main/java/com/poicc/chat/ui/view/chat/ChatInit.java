package com.poicc.chat.ui.view.chat;

import com.poicc.chat.ui.Main;
import com.poicc.chat.ui.view.UIObject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

/**
 * @description: 窗体初始化
 * @author: crq
 * @create: 2021-10-22 23:47
 **/
public class ChatInit extends UIObject {

    private static final String RESOURCE_NAME = "view/chat/chat.fxml";

    ChatInit() {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(RESOURCE_NAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root, 980, 720);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("view/chat/img/head/logo.png"))));
        initView();
        initEventDefine();
    }

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {

    }
}
