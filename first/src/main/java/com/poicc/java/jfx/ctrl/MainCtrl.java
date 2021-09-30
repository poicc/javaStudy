package com.poicc.java.jfx.ctrl;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @description: 主界面控制器
 * @author: crq
 * @create: 2021-09-30 22:29
 **/
public class MainCtrl implements Initializable {
    public Pane rootPane;

    public Button btnAlert;


    public TextField input;

    public ListView<String> listView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("initialize: " + location.getPath());
    }

    /**
     * 弹出框按钮单击事件
     *
     * @param actionEvent 事件对象
     */
    public void onBtnAlertClick(ActionEvent actionEvent) throws IOException {
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setContentText("你好");
//        alert.show();
        input.setVisible(true);
        input.setManaged(true);
        listView.setVisible(true);
        listView.setManaged(true);

    }

}
