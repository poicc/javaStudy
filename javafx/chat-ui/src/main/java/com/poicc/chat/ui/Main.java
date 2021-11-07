package com.poicc.chat.ui;

import com.poicc.chat.ui.view.chat.ChatController;
import com.poicc.chat.ui.view.chat.IChatEvent;
import com.poicc.chat.ui.view.chat.IChatMethod;
import com.poicc.chat.ui.view.chat.group_bar_friend.ElementFriendNewUser;
import javafx.application.Application;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

/**
 * @author crq
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        IChatMethod chat = new ChatController(new IChatEvent() {
//        });
//        chat.doShow();
//        chat.setUserInfo("1000001", "poicc", "https://cdn.jsdelivr.net/gh/1802343228/image@main/avatar.3sylmzwhoqi0.png");
//
//        chat.addTalkBox(-1, 0, "1000001", "老班", "https://cdn.jsdelivr.net/gh/mqxu/wiki-image@master/avatar/me.5y3oh3q7cy00.jpg", "宝藏老班", new Date(), true);
//        chat.addTalkMsgUserLeft("1000001", "Hi，我通过你的好友请求了 现在我们可以开始聊天啦", new Date(), true, false, true);
//        chat.addTalkMsgRight("1000001", "我只知道记忆与我同在，将美好的往事完美的浓缩起来，如同一笔浓墨重彩", new Date(), true, true, false);
//
//
//        // 好友 - 对话框
//        chat.addTalkBox(-1, 0, "1000002", "尚宇驰", "https://avatars.githubusercontent.com/u/55419799?v=4", "走", new Date(), false);
//        chat.addTalkMsgRight("1000002", "干饭吗", new Date(), true, true, false);
//        chat.addTalkMsgUserLeft("1000002", "干饭吗", new Date(), true, false, true);
//
//
//        // 群组
//        chat.addFriendGroup("2000001", "松山院", "https://cdn.jsdelivr.net/gh/poicc/image@main/ssy.6ri61mw42ko0.png");
//        chat.addFriendGroup("2000002", "终身学习者", "https://cdn.jsdelivr.net/gh/poicc/image@main/logo1.u02ftgk681c.png");

        // 事件类实现并注入
        IChatMethod chat = new ChatController(new IChatEvent() {
            @Override
            public void doQuit() {
                System.out.println("退出操作！");
            }

            @Override
            public void doSendMsg(String userId, String talkId, Integer talkType, String msg, Integer msgType, Date msgDate) {
                System.out.println("发送消息");
                System.out.println("userId：" + userId);
                System.out.println("talkType[0好友/1群组]：" + talkType);
                System.out.println("talkId：" + talkId);
                System.out.println("msg：" + msg);
                System.out.println("msgType[0文字消息/1固定表情]：" + msgType);
            }

            @Override
            public void doEventAddTalkUser(String userId, String userFriendId) {
                System.out.println("填充到聊天窗口[好友] userFriendId：" + userFriendId);
            }

            @Override
            public void doEventAddTalkGroup(String userId, String groupId) {
                System.out.println("填充到聊天窗口[群组] groupId：" + groupId);
            }

            @Override
            public void doEventDelTalkUser(String userId, String talkId) {
                System.out.println("删除对话框：" + talkId);
            }

            @Override
            public void addFriendNew(String userId, ListView<Pane> listView) {
                System.out.println("新的朋友");
                // 添加朋友
                listView.getItems().add(new ElementFriendNewUser("1000004", "彼岸花开", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/1.jpg", 0).pane());
                listView.getItems().add(new ElementFriendNewUser("1000005", "开到荼蘼", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/2.jpg", 1).pane());
            }

            @Override
            public void doFriendNewSearch(String userId, String text) {
                System.out.println("搜索好友：" + text);
            }

            @Override
            public void doEventAddNewUser(String userId, String friendId) {
                System.out.println("添加好友：" + friendId);
            }
        });

        chat.doShow();
        chat.setUserInfo("1000001", "陶然然", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/me.jpg");

        // 好友
        chat.addFriendUser(false, "1000002", "陈蓉琪", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/crq.jpg");
        chat.addFriendUser(true, "1000003", "尚宇驰", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/syc.jpg");

        // 群组
        chat.addFriendGroup("2000001", "松山院", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/hand-7.jpg");
        chat.addFriendGroup("2000002", "达摩院", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/hand-2.jpg");

        // 好友 - 对话框
        chat.addTalkBox(-1, 0, "1000002", "陈蓉琪", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/crq.jpg", "", new Date(), false);
        chat.addTalkMsgUserLeft("1000002", "冷暖我不念你", 0, new Date(), true, false, false);
        chat.addTalkMsgRight("1000002", "一个谜一样的你", 0, new Date(), true, true, false);
        chat.addTalkMsgUserLeft("1000002", "江河知道你", 0, new Date(), true, false, true);

        chat.addTalkBox(-1, 0, "1000003", "尚宇驰", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/syc.jpg", null, null, false);
        chat.addTalkMsgUserLeft("1000003", "却意外的特别着迷", 0, new Date(), true, false, false);
        chat.addTalkMsgRight("1000003", "我迫切的想要呼吸", 0, new Date(), true, true, false);
        chat.addTalkMsgUserLeft("1000003", "可是高米店南 不见高米店南", 0, new Date(), true, false, true);

        // 群组 - 对话框
        chat.addTalkBox(0, 1, "2000001", "松山院", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/hand-7.jpg", "", new Date(), false);
        chat.addTalkMsgGroupLeft("2000001", "1000002", "陈蓉琪", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/crq.jpg", "是你不是你 梦不可及", 0, new Date(), true, false, false);
        chat.addTalkMsgRight("2000001", "美丽不美丽 可喜又可惜", 0, new Date(), true, true, true);
        chat.addTalkMsgGroupLeft("2000001", "1000003", "尚宇驰", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/syc.jpg", "有始无终的 无疾而终的", 0, new Date(), true, false, false);

    }



    public static void main(String[] args) {
        launch(args);
    }
}