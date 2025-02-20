package org.main.module03_w4_labwork;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AccountCreationController {

    @FXML
    private Button backBtn;

    @FXML
    private Button createBtn;

    @FXML
    private TextField firstNameTxt;

    @FXML
    private TextField lastNameTxt;

    @FXML
    private TextField passwordTxt;

    @FXML
    private TextField usernameTxt;

    @FXML
    void backToLoginScreen(ActionEvent event) throws IOException {
        Scene scene = (backBtn.getScene());
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("login-page.fxml"));
        scene.setRoot(fxmlLoader.load());
    }

    @FXML
    void moveToUserPage(ActionEvent event) throws IOException {
        String firstName = firstNameTxt.getText();
        String lastName = lastNameTxt.getText();
        String username = usernameTxt.getText();
        String password = passwordTxt.getText();

        if(firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText(null);
            alert.setContentText("Fields cannot be empty!");
            alert.showAndWait();
        }
        else{
            Scene scene = (createBtn.getScene());
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("user-page.fxml"));
            scene.setRoot(fxmlLoader.load());
        }


    }

}
