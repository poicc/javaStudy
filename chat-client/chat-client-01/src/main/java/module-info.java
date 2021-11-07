module top.mqxu.chat.client {
    requires com.poicc.chatui;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;
    requires lombok;
    requires chat.server.agreement;
    requires io.netty.all;
    requires fastjson;

    opens com.poicc.chat to javafx.fxml;
    exports com.poicc.chat;
}