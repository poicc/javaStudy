package com.poicc.chat.ui;

import com.poicc.chat.ui.view.chat.ChatController;
import com.poicc.chat.ui.view.chat.IChatMethod;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author crq
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        ILoginMethod login = new LoginController((userId, userPassword) -> {
//            System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
//        });
//        login.doShow();
        IChatMethod chat = new ChatController();
        chat.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}