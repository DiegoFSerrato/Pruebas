//No se porque no me corre desde intellij, pero probe a ejecutar desde el diretorio de build.gradle con PowerShell y si funciona
//./gradlew clean build
//./gradlew run
package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/demo/hello-view.fxml"));
        primaryStage.setTitle("Cafeterías UCA");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
