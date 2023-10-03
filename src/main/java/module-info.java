module com.example.latexviewtemplatea7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires latexview;


    opens com.example.latexviewtemplatea7 to javafx.fxml;
    exports com.example.latexviewtemplatea7;
}