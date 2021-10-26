module com.poicc.basic {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.github.oshi;
    requires fastjson;
    requires java.desktop;


    opens com.poicc.basic to javafx.fxml;
    exports com.poicc.basic;

    exports com.poicc.basic.chart;
    opens com.poicc.basic.chart to javafx.fxml;

    exports com.poicc.basic.trayicon;
    opens com.poicc.basic.trayicon to javafx.fxml;

    exports com.poicc.basic.animation;
    opens com.poicc.basic.animation to javafx.fxml;
}