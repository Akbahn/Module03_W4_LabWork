package org.main.module03_w4_labwork;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SplashScreenController {

    @FXML
    private ProgressBar progBar;

    @FXML
    private ImageView splashScreenPic;

    @FXML
    void moveToLoginScreen(MouseEvent event) throws IOException {
        Scene scene = (splashScreenPic.getScene());
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("login-page.fxml"));
        scene.setRoot(fxmlLoader.load());


    }

}
