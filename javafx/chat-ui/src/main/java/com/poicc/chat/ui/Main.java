package com.poicc.chat.ui;

import com.poicc.chat.ui.view.chat.ChatController;
import com.poicc.chat.ui.view.chat.IChatEvent;
import com.poicc.chat.ui.view.chat.IChatMethod;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

/**
 * @author crq
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        IChatMethod chat = new ChatController(new IChatEvent() {
        });
        chat.doShow();
        chat.setUserInfo("1000001", "poicc", "https://cdn.jsdelivr.net/gh/1802343228/image@main/avatar.3sylmzwhoqi0.png");

        chat.addTalkBox(-1, 0, "1000001", "老班", "https://cdn.jsdelivr.net/gh/mqxu/wiki-image@master/avatar/me.5y3oh3q7cy00.jpg", "宝藏老班", new Date(), true);
        chat.addTalkMsgUserLeft("1000001", "Hi，我通过你的好友请求了 现在我们可以开始聊天啦", new Date(), true, false, true);
        chat.addTalkMsgRight("1000001", "我只知道记忆与我同在，将美好的往事完美的浓缩起来，如同一笔浓墨重彩", new Date(), true, true, false);


        // 好友 - 对话框
        chat.addTalkBox(-1, 0, "1000002", "尚宇驰", "https://avatars.githubusercontent.com/u/55419799?v=4", "走", new Date(), false);
        chat.addTalkMsgRight("1000002", "干饭吗", new Date(), true, true, false);
        chat.addTalkMsgUserLeft("1000002", "干饭吗", new Date(), true, false, true);


        // 群组
        chat.addFriendGroup("2000001", "松山院", "https://cdn.jsdelivr.net/gh/poicc/image@main/ssy.6ri61mw42ko0.png");
        chat.addFriendGroup("2000002", "终身学习者", "https://cdn.jsdelivr.net/gh/poicc/image@main/logo1.u02ftgk681c.png");

        //        chat.addTalkBox(-1, 0, "1000003", "猩猩", "http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20200223/e0056209511341bfabad4ea8463b322c.jpeg", "不会还有人在学习吧", new Date(), false);
//        chat.addTalkMsgRight("1000003", "快推文快推文", new Date(), true, false, false);
//        chat.addTalkMsgUserLeft("1000003", "拒绝", new Date(), true, false, true);
//        chat.addTalkMsgUserLeft("1000003", "不给", new Date(), true, true, true);
//
//        chat.addTalkBox(-1, 0, "1000004", "赖慧林", "https://i01piccdn.sogoucdn.com/2e471a61f64b4b81", "乌拉", new Date(), false);
//        chat.addTalkMsgRight("1000004", "点名了叫我", new Date(), true, false, false);
//        chat.addTalkMsgUserLeft("1000004", "乌拉", new Date(), true, true, false);
//        chat.addTalkMsgUserLeft("1000004", "乌拉乌拉", new Date(), true, false, true);

        // 群组 - 对话框

//        chat.addTalkBox(0, 1, "5307398", "筠竹苑联谊群", "https://cdn.jsdelivr.net/gh/poicc/image@main/2.5ycxoeqclio0.jpg", "笑死", new Date(), false);
//        chat.addTalkMsgRight("5307398", "我要看男酮", new Date(), true, true, false);
//        chat.addTalkMsgGroupLeft("5307398", "1000001", "尚宇驰", "https://avatars.githubusercontent.com/u/55419799?v=4", "芜湖", new Date(), true, false, true);
//        chat.addTalkMsgGroupLeft("5307398", "1000006", "杨阳", "https://avatars.githubusercontent.com/u/46114572?v=4", "修电脑，单身狗", new Date(), true, false, true);
//        chat.addTalkMsgGroupLeft("5307398", "1000005", "poi", "https://cdn.jsdelivr.net/gh/poicc/image@main/wl.3vo9zify6440.jpg", "这里没有男酮", new Date(), true, false, true);


        chat.addTalkBox(0, 1, "5307397", "松山院", "https://cdn.jsdelivr.net/gh/poicc/image@main/2.5ycxoeqclio0.jpg", "", new Date(), false);
        chat.addTalkMsgGroupLeft("5307397", "1000001", "老班", "https://cdn.jsdelivr.net/gh/mqxu/wiki-image@master/avatar/me.5y3oh3q7cy00.jpg", "早上好", new Date(), true, false, true);
//        chat.addTalkMsgRight("5307397", "早上好", new Date(), true, true, false);
        chat.addTalkMsgGroupLeft("5307397", "1000006", "大哥", "http://inews.gtimg.com/newsapp_bt/0/13353726598/1000", "大家早上好", new Date(), true, false, true);
        chat.addTalkMsgGroupLeft("5307397", "1000005", "杨洋", "https://i04piccdn.sogoucdn.com/90fc4ee9cedaf38a", "早上好", new Date(), true, false, true);
        chat.addTalkMsgGroupLeft("5307397", "1000005", "王林", "https://i01piccdn.sogoucdn.com/2e471a61f64b4b81", "早上好", new Date(), true, false, true);

        // 好友
        chat.addFriendUser(false, "1000002", "老班", "https://cdn.jsdelivr.net/gh/mqxu/wiki-image@master/avatar/me.5y3oh3q7cy00.jpg");
        chat.addFriendUser(false, "1000005", "王林", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/wl.jpg");
        chat.addFriendUser(false, "1000003", "尚宇驰", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/syc.jpg");
        chat.addFriendUser(false, "1000004", "杨阳", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/yy.jpg");


//        ILoginMethod login = new LoginController((userId, userPassword) -> {
//            if("admin".equals(userId) && "123456".equals(userPassword)) {
//                Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                alert.titleProperty().set("提示");
//                alert.headerTextProperty().set("登录成功！");
//                alert.showAndWait();
//                IChatMethod  chat = new ChatController();
//                chat.doShow();
//                // 填充对话框测试数据
//                chat.addTalkBox(-1, 0, "1000001", "陶然然", "https://cdn.jsdelivr.net/gh/mqxu/wiki-image@master/avatar/me.5y3oh3q7cy00.jpg", "开到荼蘼", new Date(), true);
//                chat.addTalkBox(-1, 0, "1000002", "杨阳", "https://avatars.githubusercontent.com/u/46114572?v=4", "这世界只有10种人，一种是程序员，一种不是。", new Date(), false);
//                chat.addTalkBox(-1, 0, "1000003", "尚宇驰", "https://avatars.githubusercontent.com/u/55419799?v=4", "PuTTY本无树，MinGW亦非台。", new Date(), false);
//                chat.addTalkBox(-1, 0, "1000005", "王林", "https://cdn.jsdelivr.net/gh/poicc/image@main/wl.3vo9zify6440.jpg", "生产队的驴", new Date(), false);
//                chat.addTalkBox(-1, 0, "1000007", "筠竹苑联谊群", "https://cdn.jsdelivr.net/gh/poicc/image@main/2.5ycxoeqclio0.jpg", "松山院~学习之路", new Date(), false);
//                chat.addTalkBox(0, 1, "1000006", "微信运动", "http://images.shejidaren.com/wp-content/uploads/2020/03/36365-2.png", "应用消息", new Date(), false);
//                chat.addTalkBox(0, 1, "1000008", "学习之路", "https://cdn.jsdelivr.net/gh/poicc/image@main/logo2.2p5ggyfnrha0.png", "学习之路", new Date(), false);
//                chat.addTalkBox(0, 1, "1000009", "极客营", "https://cdn.jsdelivr.net/gh/poicc/image@main/logo.45sw0xll2k60.png", "极客营", new Date(), false);
//                chat.addTalkBox(0, 1, "5307397", "松山院", "https://cdn.jsdelivr.net/gh/poicc/image@main/ssy.6ri61mw42ko0.png", "松山院~学习之路", new Date(), false);
//                chat.addTalkBox(0, 1, "5307398", "终生学习者", "https://cdn.jsdelivr.net/gh/poicc/image@main/logo1.u02ftgk681c.png", "终身学习者", new Date(), false);
//            }
//        });
//        login.doShow();
    }



    public static void main(String[] args) {
        launch(args);
    }
}