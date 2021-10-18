package com.poicc.basic.chart;

import com.alibaba.fastjson.JSONObject;
import com.poicc.basic.util.SystemInfoUtil;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author crq
 */
public class PieChartDemo extends Application {


    @Override
    public void start(Stage stage) throws IOException, ParseException {
        PieChart pieChart = new PieChart();
        pieChart.setData(getChartData());
        pieChart.setTitle("JVM使用情况");
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setClockwise(false);
        pieChart.setLabelsVisible(false);
        StackPane root = new StackPane();
        root.getChildren().add(pieChart);
        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }

    private ObservableList<PieChart.Data> getChartData() throws ParseException {
        JSONObject jsonObject = SystemInfoUtil.getInfo();
        NumberFormat nf = NumberFormat.getPercentInstance();
        String mem = jsonObject.getJSONObject("memInfo").get("usageRate").toString();
        Number m1 = nf.parse(mem);
        Double memInfo = m1.doubleValue();
        String jvm = jsonObject.getJSONObject("jvmInfo").get("usageRate").toString();
        Number m2 = nf.parse(jvm);
        Double jvmInfo = m2.doubleValue();
        String cpu = jsonObject.getJSONObject("cpuInfo").get("cSys").toString();
        Number m3 = nf.parse(jvm);
        Double cpuInfo = m3.doubleValue();
        ObservableList<javafx.scene.chart.PieChart.Data> answer =
                FXCollections.observableArrayList();
        answer.addAll(new PieChart.Data("已使用", jvmInfo),
                new PieChart.Data("空闲", 1 - jvmInfo)
        );
        return answer;
    }

    public static void main(String[] args) {
        launch();
    }
}