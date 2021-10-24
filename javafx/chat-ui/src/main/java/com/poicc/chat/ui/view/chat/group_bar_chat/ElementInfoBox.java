package com.poicc.chat.ui.view.chat.group_bar_chat;

import com.poicc.chat.ui.util.AutoSizeTool;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * @description: 具体的聊天信息
 * @author: crq
 * @create: 2021-10-24 18:46
 **/
public class ElementInfoBox {
    private Pane pane;

    /**
     * 头像
     */
    private Pane head;

    /**
     * 昵称区
     */
    private Label nikeName;

    /**
     * 内容箭头
     */
    private Label infoContentArrow;

    /**
     * 内容
     */
    private TextArea infoContent;

    /**
     * 左侧消息来自好友
     * @param userNickName userNickName
     * @param userHead userHead
     * @param msg msg
     * @return return
     */
    public Pane left(String userNickName, String userHead, String msg) {
        double autoHeight = AutoSizeTool.getHeight(msg);
        double autoWidth = AutoSizeTool.getWidth(msg);

        pane = new Pane();
        pane.setPrefSize(500, 50 + autoHeight);
        pane.getStyleClass().add("infoBoxElement");
        ObservableList<Node> children = pane.getChildren();

        // 头像
        head = new Pane();
        head.setPrefSize(50, 50);
        head.setLayoutX(15);
        head.setLayoutY(15);
        head.getStyleClass().add("box_head");
        head.setStyle(String.format("-fx-background-image: url('%s')", userHead));
        children.add(head);

        // 昵称
        nikeName = new Label();
        nikeName.setPrefSize(450, 20);
        nikeName.setLayoutX(75);
        nikeName.setLayoutY(5);
        nikeName.setText(userNickName);
        nikeName.getStyleClass().add("box_nikeName");
        children.add(nikeName);

        // 箭头
        infoContentArrow = new Label();
        infoContentArrow.setPrefSize(5, 20);
        infoContentArrow.setLayoutX(75);
        infoContentArrow.setLayoutY(30);
        infoContentArrow.getStyleClass().add("box_infoContent_arrow");
        children.add(infoContentArrow);

        // 内容
        infoContent = new TextArea();
        infoContent.setPrefWidth(autoWidth);
        infoContent.setPrefHeight(autoHeight);
        infoContent.setLayoutX(80);
        infoContent.setLayoutY(30);
        infoContent.setWrapText(true);
        infoContent.setEditable(false);
        infoContent.setText(msg);
        infoContent.getStyleClass().add("box_infoContent_left");
        children.add(infoContent);

        return pane;
    }

    /**
     * 右侧消息来自自己
     * @param userNickName userNickName
     * @param userHead userHead
     * @param msg msg
     * @return return
     */
    public Pane right(String userNickName, String userHead, String msg) {
        double autoHeight = AutoSizeTool.getHeight(msg);
        double autoWidth = AutoSizeTool.getWidth(msg);

        pane = new Pane();
        pane.setPrefSize(500, 50 + autoHeight);
        pane.setLayoutX(853);
        pane.setLayoutY(0);
        pane.getStyleClass().add("infoBoxElement");
        ObservableList<Node> children = pane.getChildren();

        // 头像
        head = new Pane();
        head.setPrefSize(50, 50);
        head.setLayoutX(770);
        head.setLayoutY(15);
        head.getStyleClass().add("box_head");
        head.setStyle(String.format("-fx-background-image: url('%s')", userHead));
        children.add(head);

        // 箭头
        infoContentArrow = new Label();
        infoContentArrow.setPrefSize(5, 20);
        infoContentArrow.setLayoutX(755);
        infoContentArrow.setLayoutY(15);
        infoContentArrow.getStyleClass().add("box_infoContent_arrow");
        children.add(infoContentArrow);

        // 内容
        infoContent = new TextArea();
        infoContent.setPrefWidth(autoWidth);
        infoContent.setPrefHeight(autoHeight);
        infoContent.setLayoutX(755 - autoWidth);
        infoContent.setLayoutY(15);
        infoContent.setWrapText(true);
        infoContent.setEditable(false);
        infoContent.setText(msg);
        infoContent.getStyleClass().add("box_infoContent_right");
        children.add(infoContent);

        return pane;
    }
}
