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
                chat.addTalkBox(-1, 0, "1000001", "陶然然", "https://cdn.jsdelivr.net/gh/mqxu/wiki-image@master/avatar/me.5y3oh3q7cy00.jpg", "开到荼蘼", new Date(), true);
                chat.addTalkBox(-1, 0, "1000002", "杨阳", "https://avatars.githubusercontent.com/u/46114572?v=4", "这世界只有10种人，一种是程序员，一种不是。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000003", "尚宇驰", "https://avatars.githubusercontent.com/u/55419799?v=4", "PuTTY本无树，MinGW亦非台。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000005", "王林", "https://cdn.jsdelivr.net/gh/poicc/image@main/wl.3vo9zify6440.jpg", "生产队的驴", new Date(), false);
//                chat.addTalkBox(-1, 0, "1000007", "筠竹苑联谊群", "http://www.wanandroid.com/blogimgs/cf1cf10c-4450-4ef4-a857-1b8d9e14ab03.PNG", "松山院~学习之路", new Date(), false);
                chat.addTalkBox(0, 1, "1000006", "微信运动", "http://images.shejidaren.com/wp-content/uploads/2020/03/36365-2.png", "应用消息", new Date(), false);
                chat.addTalkBox(0, 1, "1000008", "学习之路", "https://cdn.jsdelivr.net/gh/poicc/image@main/logo2.2p5ggyfnrha0.png", "学习之路", new Date(), false);
                chat.addTalkBox(0, 1, "1000009", "极客营", "https://cdn.jsdelivr.net/gh/poicc/image@main/logo.45sw0xll2k60.png", "极客营", new Date(), false);
                chat.addTalkBox(0, 1, "5307397", "松山院", "https://cdn.jsdelivr.net/gh/poicc/image@main/ssy.6ri61mw42ko0.png", "松山院~学习之路", new Date(), false);
                chat.addTalkBox(0, 1, "5307398", "终生学习者", "https://cdn.jsdelivr.net/gh/poicc/image@main/logo1.u02ftgk681c.png", "终身学习者", new Date(), false);
            }
        });
        login.doShow();
    }



    public static void main(String[] args) {
        launch(args);
    }
}