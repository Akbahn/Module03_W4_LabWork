package org.main.module03_w4_labwork;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;

public class LoginPageController {

    @FXML
    private Button createBtn;

    @FXML
    private Button loginBtn;

    @FXML
    private TextField password;

    @FXML
    private TextField userName;

    @FXML
    void createAccount(ActionEvent event) throws IOException {
        Scene scene = (createBtn.getScene());
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("account-creation.fxml"));
        scene.setRoot(fxmlLoader.load());


    }

    @FXML
    void validateCred(ActionEvent event) throws IOException {
        Scene scene = (loginBtn.getScene());
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("user-page.fxml"));
        scene.setRoot(fxmlLoader.load());

    }

}
