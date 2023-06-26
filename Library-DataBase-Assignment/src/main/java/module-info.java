module com.example.librarydatabaseassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.librarydatabaseassignment to javafx.fxml;
    exports com.example.librarydatabaseassignment;
}