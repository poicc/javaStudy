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

/**
 * @author crq
 */
public class PieChartDemo extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        PieChart pieChart = new PieChart();
        pieChart.setData(getChartData());
        pieChart.setTitle("饼图");
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setClockwise(false);
        pieChart.setLabelsVisible(false);
        StackPane root = new StackPane();
        root.getChildren().add(pieChart);
        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }

    private ObservableList<PieChart.Data> getChartData()
    {
        JSONObject jsonObject = SystemInfoUtil.getInfo();
        System.out.println(jsonObject.getJSONObject("memInfo").get("usageRate"));
        String mem = jsonObject.getJSONObject("memInfo").get("usageRate").toString();
        Double memInfo = Double.valueOf(mem.substring(0,mem.length() - 1));
        String jvm = jsonObject.getJSONObject("jvmInfo").get("usageRate").toString();
        Double jvmInfo = Double.valueOf(jvm.substring(0,jvm.length() - 1));
        String cpu = jsonObject.getJSONObject("cpuInfo").get("cSys").toString();
        Double cpuInfo = Double.valueOf(cpu.substring(0,cpu.length() - 1));
        ObservableList<javafx.scene.chart.PieChart.Data> answer =
                FXCollections.observableArrayList();
        answer.addAll(new PieChart.Data("内存使用情况", memInfo),
                new PieChart.Data("jvm使用情况", jvmInfo),
                new PieChart.Data("CPU使用情况", cpuInfo)
        );
        return answer;
    }

    public static void main(String[] args) {
        launch();
    }
}