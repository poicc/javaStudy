package com.poicc.chat.ui.view.chat;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-22 23:43
 **/
public class ChatEventDefine {

    private final ChatInit chatInit;

    public ChatEventDefine(ChatInit chatInit) {
        this.chatInit = chatInit;
        chatInit.move();
        barChat();
        barFriend();
        barLocation();
        barSet();
    }

    /**
     * 切换聊天窗体方法
     *
     * @param barChat      barChat
     * @param groupBarChat groupBarChat
     * @param toggle       toggle
     */
    private void switchBarChat(Button barChat, Pane groupBarChat, boolean toggle) {
        groupBarChat.setVisible(toggle);
    }

    /**
     * 切换好友窗体方法
     *
     * @param barFriend      barFriend
     * @param groupBarFriend groupBarFriend
     * @param toggle         toggle
     */
    private void switchBarFriend(Button barFriend, Pane groupBarFriend, boolean toggle) {
        groupBarFriend.setVisible(toggle);
    }

    /**
     * 切换好友收藏方法
     *
     * @param barLocation    barLocation
     * @param groupBarFriend groupBarLocation
     * @param toggle         toggle
     */
    private void switchBarLocation(Button barLocation, Pane groupBarFriend, boolean toggle) {
        groupBarFriend.setVisible(toggle);
    }

    /**
     * 切换好友更多方法
     *
     * @param barSet         barSet
     * @param groupBarFriend groupBarSet
     * @param toggle         toggle
     */
    private void switchBarSet(Button barSet, Pane groupBarFriend, boolean toggle) {
        groupBarFriend.setVisible(toggle);
    }


    /**
     * 条形 Bar 聊天框
     */
    private void barChat() {
        Button barChat = chatInit.$("barChat", Button.class);
        Pane groupBarChat = chatInit.$("groupBarChat", Pane.class);
        barChat.setOnAction(event -> {
            switchBarChat(barChat, groupBarChat, true);
            switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
            switchBarLocation(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
            switchBarSet(chatInit.$("barSet", Button.class), chatInit.$("groupBarSet", Pane.class), false);
        });
    }

    /**
     * 条形 Bar 好友框体事件
     */
    private void barFriend() {
        Button barFriend = chatInit.$("barFriend", Button.class);
        Pane groupBarFriend = chatInit.$("groupBarFriend", Pane.class);
        barFriend.setOnAction(event -> {
                    switchBarChat(chatInit.$("barChat", Button.class), chatInit.$("groupBarChat", Pane.class), false);
                    switchBarLocation(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
                    switchBarSet(chatInit.$("barSet", Button.class), chatInit.$("groupBarSet", Pane.class), false);
                    switchBarFriend(barFriend, groupBarFriend, true);
                }
        );
    }


    /**
     * 条形 Bar 收藏框体事件
     */
    private void barLocation() {
        Button barLocation = chatInit.$("barLocation", Button.class);
        Pane groupBarLocation = chatInit.$("groupBarLocation", Pane.class);
        barLocation.setOnAction(event -> {
                    switchBarChat(chatInit.$("barChat", Button.class), chatInit.$("groupBarChat", Pane.class), false);
                    switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
                    switchBarSet(chatInit.$("barSet", Button.class), chatInit.$("groupBarSet", Pane.class), false);
                    switchBarLocation(barLocation, groupBarLocation, true);
                }
        );
    }

    /**
     * 条形 Bar 更多框体事件
     */
    private void barSet() {
        Button barSet = chatInit.$("barSet", Button.class);
        Pane groupBarSet = chatInit.$("groupBarSet", Pane.class);
        barSet.setOnAction(event -> {
                    switchBarChat(chatInit.$("barChat", Button.class), chatInit.$("groupBarChat", Pane.class), false);
                    switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
                    switchBarLocation(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
                    switchBarSet(barSet, groupBarSet, true);
                }
        );
    }
}
