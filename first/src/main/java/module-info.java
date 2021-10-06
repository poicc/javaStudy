module java.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires AnimateFX;

    opens com.poicc.java.jfx.ctrl to javafx.fxml;
    opens com.poicc.java.jfx to javafx.fxml;
    exports com.poicc.java.jfx;

    opens com.poicc.java.jfx.layout to javafx.fxml;
    exports com.poicc.java.jfx.layout;

    opens com.poicc.java.jfx.basic to javafx.fxml;
    exports com.poicc.java.jfx.basic;

}