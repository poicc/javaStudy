package com.poicc.java.jfx.view;

import com.poicc.java.jfx.App;
import com.poicc.java.jfx.model.Person;
import com.poicc.java.jfx.util.DateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @description:
 * @author: crq
 * @date: 2021-10-10 22:31
 */
public class PersonEditController {


    private Stage editStage;

    private App mainApp;


    @FXML
    private TextField nameField;

    @FXML
    private TextField clazzField;

    @FXML
    private RadioButton maleButton;

    @FXML
    private RadioButton femaleButton;

    @FXML
    private ToggleGroup group;

    @FXML
    private TextField addressField;

    @FXML
    private TextField birthdayField;

    @FXML
    private TextField avatarField;

    @FXML
    private void initialize() {
    }

    public void setEditStage(Stage editStage) {
        this.editStage = editStage;
    }

    public void setMainApp(App mainApp) {
        this.mainApp = mainApp;
    }

    public void handleSubmit(ActionEvent actionEvent) {
        Person person = new Person();
        person.setName(nameField.getText());
        person.setClazz(clazzField.getText());
        person.setAddress(addressField.getText());
        person.setAvatar(new Image(avatarField.getText()));
        person.setBirthday(DateUtil.parse(birthdayField.getText()));
        person.setGender("男");
        //注意性别单选按钮的写法
        group.selectedToggleProperty().addListener((ov, oldVal, newVal) -> {
            System.out.println("性别");
            System.out.println(group.getSelectedToggle().getUserData().toString());
            person.setGender(group.getSelectedToggle().getUserData().toString());
        });
        mainApp.getPersonData().add(person);
        editStage.close();
        mainApp.getStage().setIconified(false);
    }

    public void handleCancel(ActionEvent actionEvent) {
        editStage.close();
        mainApp.getStage().setIconified(false);
    }
}
