module com.poicc.chatui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.poicc.chat.ui to javafx.fxml;
    exports com.poicc.chat.ui;
}