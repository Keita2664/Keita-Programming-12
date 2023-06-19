package com.example.friendsbookassignment;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    public TextField GetName;
    public TextField GetAge;
    public TextField GetGender;
    public Button AddFriend;
    public ListView list;
    public Label lblName;
    public Label lblAge;
    public Label lblGender;
    public Button deleteFriend;
    public Button loadFriend;
    public Button saveFriend;
    public Button loadMale;
    public Button loadFemale;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void addFriend(ActionEvent actionEvent) {
        String name = GetName.getText();
        int age = Integer.parseInt(GetAge.getText());
        String gender = GetGender.getText();
        Friend friend = new Friend(name, age, gender);
        list.getItems().add(friend);
        GetName.clear();
        GetAge.clear();
        GetGender.clear();
        deleteFriend.setDisable(true);
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend friend;
        friend = (Friend) list.getSelectionModel().getSelectedItem();
        lblName.setText(friend.getName());
        lblAge.setText(Integer.toString(friend.getAge()));
        lblGender.setText(friend.getGender());
        deleteFriend.setDisable(false);

    }

    public void deleteFriend(ActionEvent actionEvent) {
        Friend friend;
        friend = (Friend) list.getSelectionModel().getSelectedItem();
        list.getItems().remove(list.getSelectionModel().getSelectedIndex());
        friend = (Friend) list.getSelectionModel().getSelectedItem();
        if (friend != null){
            lblName.setText(friend.getName());
            lblAge.setText(Integer.toString(friend.getAge()));
            lblGender.setText(friend.getGender());
        }
        else{
            deleteFriend.setDisable(true);
            lblName.setText(null);
            lblAge.setText(null);
            lblGender.setText(null);
        }

        //list.getSelectionModel().getSelectedItems().remove(list.getSelectionModel().getSelectedIndex()+1);

        //friend.delete();

        //lblName.setText(null);
        //lblGender.setText(null);
        //lblAge.setText(null);
        // list.getItems().add(friend);
        // friend = null;
    }

    public void loadFriend(ActionEvent actionEvent) throws IOException {
        list.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.loadAllFriend("friend.txt");
        //for (Friend f : friends){
        //   list.getItems().add(f);
        //}
        for (int i = 0; i < friends.size(); i++){
            list.getItems().add(friends.get(i));
        }
    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> List = list.getItems();
//        int found=0;
        for (Friend f : List) {
//            if (f.compareNameAgeGender((Friend) list.getItems())){ //new Friend(f.name, f.age, f.gender))) {
//                found=1;
//            }
            f.writeToFile();
        }
        list.getItems().clear();
    }

    public void loadMale(ActionEvent actionEvent) throws IOException {
        list.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.loadMaleFriend("maleFriend.txt");
        for (int i = 0; i < friends.size(); i++){
            list.getItems().add(friends.get(i));
        }
    }

    public void loadFemale(ActionEvent actionEvent) throws IOException {
        list.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.loadFemaleFriend("femaleFriend.txt");
        for (int i = 0; i < friends.size(); i++){
            list.getItems().add(friends.get(i));
        }
    }
}
