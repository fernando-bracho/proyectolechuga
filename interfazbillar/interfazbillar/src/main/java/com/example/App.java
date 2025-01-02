package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo/application.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Negocio de Billar");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/mesa_disponible.jpg")));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
