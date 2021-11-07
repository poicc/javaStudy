module com.poicc.chatui {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;


    opens com.poicc.chat.ui to javafx.fxml;
    exports com.poicc.chat.ui;

    opens com.poicc.chat.ui.util to javafx.fxml;
    exports com.poicc.chat.ui.util;

    opens com.poicc.chat.ui.view to javafx.fxml;
    exports com.poicc.chat.ui.view;

    opens com.poicc.chat.ui.view.chat to javafx.fxml;
    exports com.poicc.chat.ui.view.chat;

    opens com.poicc.chat.ui.view.face to javafx.fxml;
    exports com.poicc.chat.ui.view.face;

    opens com.poicc.chat.ui.view.login to javafx.fxml;
    exports com.poicc.chat.ui.view.login;
}