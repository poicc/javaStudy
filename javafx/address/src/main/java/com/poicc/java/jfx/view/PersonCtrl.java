package com.poicc.java.jfx.view;

import com.poicc.java.jfx.App;
import com.poicc.java.jfx.constant.AppConstant;
import com.poicc.java.jfx.model.Person;
import com.poicc.java.jfx.util.DateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

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
    private TableColumn<Person,String> genderColumn;

    @FXML
    private Label nameLabel;

    @FXML
    private Label clazzLabel;


    @FXML
    private Label addressLabel;
    @FXML
    private Label birthdayLabel;
    @FXML
    private ImageView avatar;

    private ObservableList<Person> personData;

    @FXML
    private TextField inputField;

    public PersonCtrl(){}

    @FXML
    private void initialize() {
        System.out.println("我执行了");
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        clazzColumn.setCellValueFactory(cellData -> cellData.getValue().clazzProperty());
        genderColumn.setCellValueFactory(cellData -> cellData.getValue().genderProperty());
        showPersonDetails(null);
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable,oldValue,newValue) -> showPersonDetails(newValue));
    }


    public void setApp(App app) {
        this.app = app;
        personData = app.getPersonData();
//        personTable.setItems(personData);
//        showPersonDetails(personData.get(0));
        FilteredList<Person> filteredList = new FilteredList<>(personData,p->true);
        inputField.textProperty().addListener((observable,oldValue,newValue) -> {
            filteredList.setPredicate(person -> {
                if(newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();
                return person.getName().toLowerCase().contains(lowerCaseFilter)
                        || person.getGender().toLowerCase().contains(lowerCaseFilter)
                        || person.getClazz().toLowerCase().contains(lowerCaseFilter)
                        || person.getAddress().toLowerCase().contains(lowerCaseFilter);
            });
        });
        personTable.setItems(filteredList);
    }

    private void showPersonDetails(Person person) {
        if(person != null) {
            nameLabel.setText(person.getName());
            clazzLabel.setText(person.getClazz());
            genderColumn.setText(person.getGender());
            addressLabel.setText(person.getAddress());
            birthdayLabel.setText(DateUtil.format(person.getBirthday()));
            avatar.setImage(person.getAvatar());
        } else {
            nameLabel.setText("");
            clazzLabel.setText("");
            genderColumn.setText("");
            addressLabel.setText("");
            birthdayLabel.setText("");
            avatar.setImage(new Image("https://cdn.jsdelivr.net/gh/1802343228/image@main/avatar.3sylmzwhoqi0.png"));
        }
    }

    public void handleRestPerson() {
        personData = app.getPersonData();
        personTable.setItems(personData);
        showPersonDetails(personData.get(0));
    }

    public void handleSearchPerson() {
        String keywords = inputField.getText().trim();
        ObservableList<Person> items = personTable.getItems();
        List<Person> list = items.stream()
                .filter(p -> p.getName().contains(keywords) || p.getClazz().contains(keywords) || p.getGender().contains(keywords))
                .collect(Collectors.toList());
        if(list.size() != 0) {
            personTable.setItems(FXCollections.observableList(list));
            showPersonDetails(list.get(0));
        }
        inputField.setText("");
    }

    /**
     * 删除用户
     */
    public void handleDeletePerson() {
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        if(selectedIndex >= 0) {
            app.getPersonData().remove(selectedIndex);
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("提示");
            a.setHeaderText("错误操作");
            a.setContentText("必须选择人员才能删除");
            a.showAndWait();
        }
    }

    /**
     * 新增人员
     */
    public void handleNewPerson() {
        Person tempPerson = new Person("张三","软件","女","江苏南京", LocalDate.of(2000,1,1),
                new Image("https://avatars.githubusercontent.com/u/59445871?v=4"));
        app.showEditPerson(tempPerson, AppConstant.NEW_PERSON);
    }

    public void handleEditPerson() {
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        if(selectedPerson != null) {
            app.showEditPerson(selectedPerson,AppConstant.EDIT_PERSON);
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("提示");
            a.setHeaderText("错误操作");
            a.setContentText("必须选择人员才能编辑");
            a.showAndWait();
        }
    }
}
