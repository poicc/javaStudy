module java.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires AnimateFX;

    opens com.poicc.java.jfx.ctrl to javafx.fxml;
    exports com.poicc.java.jfx;
}