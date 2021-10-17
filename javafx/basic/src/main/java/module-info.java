module com.poicc.basic {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.github.oshi;
    requires fastjson;


    opens com.poicc.basic to javafx.fxml;
    exports com.poicc.basic;

    exports com.poicc.basic.chart;
    opens com.poicc.basic.chart to javafx.fxml;
}