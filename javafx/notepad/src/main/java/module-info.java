module com.poicc.nodepad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.poicc.notepad to javafx.fxml;
    exports com.poicc.notepad;

    opens com.poicc.notepad.view to javafx.fxml;
    exports com.poicc.notepad.view;
}