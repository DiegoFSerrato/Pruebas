module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.swing;
    requires javafx.media;



    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}