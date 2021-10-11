package com.poicc.java.jfx.view;

import com.poicc.java.jfx.App;
import javafx.fxml.FXML;

/**
 * @description: RootController
 * @author: crq
 * @create: 2021-10-11 21:29
 **/
public class RootController {

    private App app;

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    private void handleShowBirthdayStatistics() {
        app.showBirthdayStatistics();
    }
}
