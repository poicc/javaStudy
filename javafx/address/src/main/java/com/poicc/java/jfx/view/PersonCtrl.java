package com.poicc.java.jfx.view;

import com.poicc.java.jfx.App;
import com.poicc.java.jfx.model.Person;
import com.poicc.java.jfx.util.DateUtil;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @description: 主界面控制器
 * @author: crq
 * @create: 2021-09-30 22:29
 **/
public class PersonCtrl {
    private App app;

    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person,String> nameColumn;

    @FXML
    private TableColumn<Person,String> clazzColumn;

    @FXML
    private Label nameLabel;

    @FXML
    private Label clazzLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label addressLabel;
    @FXML
    private Label birthdayLabel;
    @FXML
    private ImageView avatar;

    public PersonCtrl(){}

    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        clazzColumn.setCellValueFactory(cellData -> cellData.getValue().clazzProperty());
        showPersonDetails(null);
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable,oldValue,newValue) -> showPersonDetails(newValue));
    }


    public void setApp(App app) {
        this.app = app;
        ObservableList<Person> peopleData = app.getPersonData();
        personTable.setItems(peopleData);
    }

    private void showPersonDetails(Person person) {
        if(person != null) {
            nameLabel.setText(person.getName());
            clazzLabel.setText(person.getClazz());
            genderLabel.setText(person.getGender());
            addressLabel.setText(person.getAddress());
            birthdayLabel.setText(DateUtil.format(person.getBirthday()));
            avatar.setImage(person.getAvatar());
        } else {
            nameLabel.setText("");
            clazzLabel.setText("");
            genderLabel.setText("");
            addressLabel.setText("");
            birthdayLabel.setText("");
            avatar.setImage(new Image("https://cdn.jsdelivr.net/gh/1802343228/image@main/avatar.3sylmzwhoqi0.png"));
        }
    }
}
