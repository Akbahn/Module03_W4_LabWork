package org.main.module03_w4_labwork;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("splash-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Splash Screen");
        scene.getStylesheets().add(MainApplication.class.getResource("splashscreen.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}