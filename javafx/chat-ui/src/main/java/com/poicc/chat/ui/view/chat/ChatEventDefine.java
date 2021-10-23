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
        this.barChat();
        this.barFriend();
        this.barLocation();
        this.barSet();
    }

    /**
     * 切换聊天窗体方法
     *
     * @param barChat      barChat
     * @param groupBarChat groupBarChat
     * @param toggle       toggle
     */
    private void switchBarChat(Button barChat, Pane groupBarChat, boolean toggle) {
        if(toggle) {
            groupBarChat.setVisible(true);
            barChat.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarChat.setVisible(false);
            barChat.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        }
    }

    /**
     * 切换好友窗体方法
     *
     * @param barFriend      barFriend
     * @param groupBarFriend groupBarFriend
     * @param toggle         toggle
     */
    private void switchBarFriend(Button barFriend, Pane groupBarFriend, boolean toggle) {
        if(toggle) {
            groupBarFriend.setVisible(true);
            barFriend.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarFriend.setVisible(false);
            barFriend.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        }
    }

    /**
     * 切换好友收藏方法
     *
     * @param barLocation    barLocation
     * @param groupBarFriend groupBarLocation
     * @param toggle         toggle
     */
    private void switchBarLocation(Button barLocation, Pane groupBarFriend, boolean toggle) {
        if(toggle) {
            groupBarFriend.setVisible(true);
            barLocation.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarFriend.setVisible(false);
            barLocation.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        }
    }

    /**
     * 切换好友更多方法
     *
     * @param barSet         barSet
     * @param groupBarFriend groupBarSet
     * @param toggle         toggle
     */
    private void switchBarSet(Button barSet, Pane groupBarFriend, boolean toggle) {
        if(toggle) {
            groupBarFriend.setVisible(true);
            barSet.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarFriend.setVisible(false);
            barSet.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        }
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
        barChat.setOnMouseEntered(event -> {
            boolean visible = groupBarChat.isVisible();
            if(visible) {
                return;
            }
            barChat.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barChat.setOnMouseExited(event -> {
            boolean visible = groupBarChat.isVisible();
            if(visible) {
                return;
            }
            barChat.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
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
        barFriend.setOnMouseEntered(event -> {
            boolean visible = groupBarFriend.isVisible();
            if(visible) {
                return;
            }
            barFriend.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barFriend.setOnMouseExited(event -> {
            boolean visible = groupBarFriend.isVisible();
            if(visible) {
                return;
            }
            barFriend.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
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
        barLocation.setOnMouseEntered(event -> {
            boolean visible = groupBarLocation.isVisible();
            if(visible) {
                return;
            }
            barLocation.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barLocation.setOnMouseExited(event -> {
            boolean visible = groupBarLocation.isVisible();
            if(visible) {
                return;
            }
            barLocation.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
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
        barSet.setOnMouseEntered(event -> {
            boolean visible = groupBarSet.isVisible();
            if(visible) {
                return;
            }
            barSet.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barSet.setOnMouseExited(event -> {
            boolean visible = groupBarSet.isVisible();
            if(visible) {
                return;
            }
            barSet.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
    }
}
