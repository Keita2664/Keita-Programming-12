package com.example.librarydatabaseassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

//import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class HelloController {
    //For Sign up page
    public TextField textGetFirstName;
    public TextField textGetLastName;
    public TextField textGetPinNumber;
    public TextField textGetUserName;
    public Button signUpButton;
    public ListView<NewAccounts> signOnInformation = new ListView<>();

    //For Sign in Page
    public TextField getPinNumberForSignIn;
    public TextField getUserNameForSignIn;
    public String loggedInUser;
    public Button signInButton;
    //For the library database page
    public Label lblBookTitle;
    public Label lblBookAuthor;
    public Label lblBookGenre;
    public Label lblBookQuantity;
    public Label lblBookId;
    public ListView<BookInformation> bookInformationListView = new ListView<>();
    public Label lblBorrower;
    public TextField lblNewBookAuthor;
    public TextField lblNewBookGenre;
    public TextField lblNewBookQuantity;
    public TextField lblNewBookID;
    public TextField lblNewBookTitle;
    public TextField bookReturn;
    public void signUp(ActionEvent actionEvent) throws IOException {
        String firstName = textGetFirstName.getText();
        String lastName = textGetLastName.getText();
        int pinNumber = Integer.parseInt(textGetPinNumber.getText());
        String userName = textGetUserName.getText();
        NewAccounts newAccounts = new NewAccounts(firstName,lastName,pinNumber,userName);
        signOnInformation.getItems().add(newAccounts);

        FileWriter fw = new FileWriter("friend.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write( firstName + ",\r");
        bw.write(lastName + ".\r");
        bw.write(pinNumber + "<\r");
        bw.write(userName + ">\r");
        bw.close();

        textGetFirstName.clear();
        textGetLastName.clear();
        textGetPinNumber.clear();
        textGetUserName.clear();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Your Account Have Been Created");
        alert.setContentText("Please Go Back to the Main Tab and Click the Sign On Button");
        alert.showAndWait();
    }

    public void signOn(ActionEvent actionEvent) {
        goToSignOnPage("sign-on-page.fxml", "Sign In Page");
    }

    private void goToSignOnPage(String location, String title){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/com/example/librarydatabaseassignment/" + location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //To sign in to the library database
    public void signIn(ActionEvent actionEvent) throws IOException {
        ArrayList<String> accountInfo = new ArrayList<>();
        ArrayList<String> logInInfo = new ArrayList<>();
        File logInUser = new File("loginUser.txt");
        Scanner scanner = new Scanner(new File("friend.txt"));
        while (scanner.hasNext()){
            accountInfo.add(scanner.next());
        }
        for (int i = 0; i < accountInfo.size(); i++){
            if (accountInfo.get(i).contains("<")){
                String pinInfo = accountInfo.get(i);
                logInInfo.add(pinInfo.substring(0,pinInfo.length() - 1));

            }
            else if (accountInfo.get(i).contains(">")){
                String userNameInfo = accountInfo.get(i);
                logInInfo.add(userNameInfo.substring(0, userNameInfo.length() - 1));
            }
        }

        int pinNumberForSignIn = Integer.parseInt(getPinNumberForSignIn.getText());
        String userNameForSignIn = getUserNameForSignIn.getText();


        for (int i = 0; i < logInInfo.size(); i++){
            if (Integer.toString(pinNumberForSignIn).equals(logInInfo.get(i)) && userNameForSignIn.equals(logInInfo.get(i + 1))){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Matched");
                alert.setContentText("Please Enter the database");
                alert.showAndWait();
                FileWriter fr = new FileWriter("loginUser.txt", true);
                BufferedWriter bw = new BufferedWriter(fr);
                bw.write(userNameForSignIn + "\r");
                bw.close();
                break;
            }
        }
        loggedInUser = getUserNameForSignIn.getText();
        //moving onto the database page
        goToDatabase("library-database.fxml","Library Database");

        //closing sign in window
        Stage stage = (Stage) signInButton.getScene().getWindow();
        stage.close();

    }


    private void goToDatabase(String location, String title){
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("/com/example/librarydatabaseassignment/" + location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void borrowABook(ActionEvent actionEvent) throws IOException {
        BookInformation bookInformation;
        bookInformation = bookInformationListView.getSelectionModel().getSelectedItem();
        bookInformation.borrowed();
        lblBookQuantity.setText(Integer.toString(bookInformation.getQuantity()));

        //putting all the information to logInUser ArrayList
        ArrayList<String> logInUser = new ArrayList<>();
        ArrayList<String> book = new ArrayList<>();
        FileReader fr = new FileReader("loginUser.txt");
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()){
            logInUser.add(br.readLine());
        }
        String theUser = logInUser.get(logInUser.size() - 1);
        lblBorrower.setText(theUser);


        FileWriter fw = new FileWriter("bookAndUser.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(theUser + ";\n");
        bw.write(lblBookTitle.getText() + "]\n");
        bw.close();

        FileReader fr1 = new FileReader("book.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String list = "";
        while (br1.ready()){
            list = br1.readLine();
            book.add(list.substring(0, list.length() - 1));
        }

        for (int i = 0; i < book.size(); i += 5){
            if (lblBookTitle.getText().equals(book.get(i))){
                int quantity = Integer.parseInt(book.get(i + 3)) - 1;
                book.set(i + 3, Integer.toString(quantity));
            }
        }

        FileWriter fw1 = new FileWriter("book.txt");
        BufferedWriter bw1 = new BufferedWriter(fw1);
        bw1.write("");
        bw1.close();

        FileWriter updated = new FileWriter("book.txt");
        BufferedWriter bw2 = new BufferedWriter(updated);

        for (int i = 0; i < book.size(); i += 5){
            bw2.write(book.get(i) + "<\n");
            bw2.write(book.get(i + 1) + ">\n");
            bw2.write(book.get(i + 2) + ";\n");
            bw2.write(book.get(i + 3) + ":\n");
            bw2.write(book.get(i + 4) + "]\n");
        }
        bw2.close();

    }

    public void loadBooks(ActionEvent actionEvent) throws IOException {
        String showTitle = "";
        String showAuthor = "";
        String showGenre = "";
        String showQuantity = "";
        String showBookID = "";
        ArrayList<String> readBookList = new ArrayList<>();
        ArrayList<String> showBookList = new ArrayList<>();

        FileReader fr = new FileReader("book.txt");
        BufferedReader br = new BufferedReader(fr);
        String list = "";
        while (br.ready()){
            list = br.readLine();
            readBookList.add(list.substring(0, list.length() - 1));
        }
        for (int i = 0; i < readBookList.size(); i+= 5){
            showTitle = readBookList.get(i);
            showAuthor = readBookList.get(i + 1);
            showGenre = readBookList.get(i + 2);
            showQuantity = readBookList.get(i + 3);
            showBookID = readBookList.get(i + 4);

            BookInformation bookInformation = new BookInformation(showTitle, showAuthor, showGenre, Integer.parseInt(showQuantity), Integer.parseInt(showBookID));
            bookInformationListView.getItems().add(bookInformation);
        }
    }

    public void returnABook(ActionEvent actionEvent) throws IOException {
        ArrayList<String> bookAndUser = new ArrayList<>();
        ArrayList<String> book = new ArrayList<>();
        ArrayList<String> loginUser = new ArrayList<>();
        FileReader fr = new FileReader("bookAndUser.txt");
        BufferedReader br = new BufferedReader(fr);
        String list = "";
        while (br.ready()){
            list = br.readLine();
            bookAndUser.add(list.substring(0, list.length() - 1));
        }

        FileReader fr1 = new FileReader("book.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String list1 = "";
        while (br1.ready()){
            list1 = br1.readLine();
            book.add(list1.substring(0, list1.length() - 1));
        }

        FileReader fr2 = new FileReader("loginUser.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        while (br2.ready()){
            loginUser.add(br2.readLine());
        }

        for (int i = 1; i < bookAndUser.size(); i+=2){
            if (bookReturn.getText().equals(bookAndUser.get(i))){
                bookAndUser.set(i,"");
                bookAndUser.set(i - 1, "");

                for (int j = 0; j < book.size(); j += 5){
                    if (bookReturn.getText().equals(book.get(j))){
                        int quantity = Integer.parseInt(book.get(j + 3)) + 1;
                        book.set(j + 3, Integer.toString(quantity));
                    }
                }

                //clear the content of the book.txt file
                FileWriter fw = new FileWriter("book.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("");
                bw.close();

                FileWriter fw1 = new FileWriter("book.txt", true);
                BufferedWriter bw1 = new BufferedWriter(fw1);

                for (int k = 0; k < book.size(); k+=5){
                    bw1.write(book.get(k) + "<\n");
                    bw1.write(book.get(k + 1) + ">\n");
                    bw1.write(book.get(k + 2) + ";\n");
                    bw1.write(book.get(k + 3) + ":\n");
                    bw1.write(book.get(k + 4) + "]\n");
                }
                bw1.close();
            }
        }
        bookReturn.clear();
    }

    public void displayBooks(MouseEvent mouseEvent) throws IOException {

        BookInformation displayBooks;
        displayBooks = bookInformationListView.getSelectionModel().getSelectedItem();
        lblBookTitle.setText(displayBooks.title);
        lblBookAuthor.setText(displayBooks.author);
        lblBookGenre.setText(displayBooks.genre);
        lblBookQuantity.setText(Integer.toString(displayBooks.quantity));
        lblBookId.setText(Integer.toString(displayBooks.bookID));
    }

    public void goToTheAddingPage(ActionEvent actionEvent) {
        addingPage("add-to-the-database.fxml", "For Staffs Only");
    }
    public void addingPage(String location, String title){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/com/example/librarydatabaseassignment/" + location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addToTheDatabase(ActionEvent actionEvent) throws IOException {
        String title = lblNewBookTitle.getText();
        String author = lblNewBookAuthor.getText();
        String genre = lblNewBookGenre.getText();
        String quantity = lblNewBookQuantity.getText();
        String bookID = lblNewBookID.getText();

        FileWriter fw = new FileWriter("book.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(title + "<\n");
        bw.write(author + ">\n");
        bw.write(genre + ";\n");
        bw.write(quantity + ":\n");
        bw.write(bookID + "[\n");
        bw.close();

        lblNewBookTitle.clear();
        lblNewBookAuthor.clear();
        lblNewBookGenre.clear();
        lblNewBookQuantity.clear();
        lblNewBookID.clear();
    }

}