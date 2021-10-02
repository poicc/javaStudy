module java.jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.poicc.java.jfx.ctrl to javafx.fxml;
    exports com.poicc.java.jfx;
}