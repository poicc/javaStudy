package com.poicc.java.jfx.view;

import com.poicc.java.jfx.App;
import com.poicc.java.jfx.constant.AppConstant;
import com.poicc.java.jfx.model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
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
    private Person person;
    private String type;


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
    private DatePicker birthdayPicker;

    @FXML
    private TextField avatarField;


    @FXML
    private void initialize() {
//        group.selectedToggleProperty().addListener((ov, oldVal, newVal) -> {
//            person.setGender(group.getSelectedToggle().getUserData().toString());
//        });
    }

    public void setEditStage(Stage editStage) {
        this.editStage = editStage;
    }

    public void setMainApp(App mainApp) {
        this.mainApp = mainApp;
    }

    public void handleSubmit(ActionEvent actionEvent) {
        person.setName(nameField.getText());
        person.setClazz(clazzField.getText());
        person.setAddress(addressField.getText());
        person.setAvatar(new Image(avatarField.getText()));
        person.setBirthday(birthdayPicker.getValue());
        person.setGender(group.getSelectedToggle().getUserData().toString());
       if(this.type.equals(AppConstant.NEW_PERSON)) {
           mainApp.getPersonData().add(person);
       }
        mainApp.showPerson();
    }

    public void setArgs(Person person,String type) {
        this.person = person;
        this.type = type;
        nameField.setText(person.getName());
        clazzField.setText(person.getClazz());
        group.getToggles().forEach(toggle -> {
            if(toggle.getUserData().toString().equals(person.getGender())) {
                toggle.setSelected(true);
            }
        });
        addressField.setText(person.getAddress());
        avatarField.setText(person.getAvatar().getUrl());
        birthdayPicker.setValue(person.getBirthday());
    }

    public void handleCancel(ActionEvent actionEvent) {
        mainApp.showPerson();
    }

}
