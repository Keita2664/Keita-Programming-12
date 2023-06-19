module com.example.friendsbookassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.friendsbookassignment to javafx.fxml;
    exports com.example.friendsbookassignment;
}