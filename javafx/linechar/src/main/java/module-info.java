module com.poicc.linechar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.poicc.linechar to javafx.fxml;
    exports com.poicc.linechar;
}