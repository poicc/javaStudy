package com.poicc.java.jfx.ctrl;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;

/**
 * @description: SceneCtrl
 * @author: crq
 * @create: 2021-10-02 14:42
 **/
public class SceneCtrl {
    public DatePicker datePicker;

    public void onBtnClick(ActionEvent actionEvent) {
        datePicker.setVisible(!datePicker.isVisible());
    }
}
