module java.jfx {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.poicc.java.jfx;
    opens com.poicc.java.jfx.view to javafx.fxml;
}