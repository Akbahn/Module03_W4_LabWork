package org.main.module03_w4_labwork;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class UserPageController {

    @FXML
    private Button editBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    void moveToLoginPage(ActionEvent event) throws IOException {
        Scene scene = (logoutBtn.getScene());
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("login-page.fxml"));
        //scene.getStylesheets().add(MainApplication.class.getResource("splashscreen.css").toExternalForm());
        scene.setRoot(fxmlLoader.load());

    }

}
