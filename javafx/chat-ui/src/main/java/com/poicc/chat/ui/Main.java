package com.poicc.chat.ui;

import com.poicc.chat.ui.view.chat.ChatController;
import com.poicc.chat.ui.view.chat.IChatMethod;
import com.poicc.chat.ui.view.login.ILoginMethod;
import com.poicc.chat.ui.view.login.LoginController;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

/**
 * @author crq
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ILoginMethod login = new LoginController((userId, userPassword) -> {
            if("admin".equals(userId) && "123456".equals(userPassword)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.titleProperty().set("提示");
                alert.headerTextProperty().set("登录成功！");
                alert.showAndWait();
                IChatMethod  chat = new ChatController();
                chat.doShow();
                // 填充对话框测试数据
                chat.addTalkBox(-1, 0, "1000001", "陶然然", "***.jpg", "开到荼蘼", new Date(), true);
                chat.addTalkBox(-1, 0, "1000002", "杨阳", "***.jpg", "这世界只有10种人，一种是程序员，一种不是。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000003", "尚宇驰", "***.jpg", "PuTTY本无树，MinGW亦非台。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000004", "陈蓉琪", "***.jpg", "Write the code. Change the world.", new Date(), false);
                chat.addTalkBox(-1, 0, "1000005", "王林", "***.jpg", "生产队的驴", new Date(), false);
                chat.addTalkBox(0, 1, "5307397", "ssy松山院", "***.jpg", "松山院~学习之路", new Date(), false);
            }
        });
        login.doShow();
    }



    public static void main(String[] args) {
        launch(args);
    }
}