module java.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;

    opens com.weather.java.jfx.fxml to javafx.fxml;
    exports com.weather.java.jfx;

    opens com.weather.java.jfx.ctrl to javafx.fxml;
    exports com.weather.java.jfx.ctrl;

    exports com.weather.java.jfx.util;
}