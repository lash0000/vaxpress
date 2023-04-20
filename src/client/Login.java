/**
 *  2023 - DEV
 *  Developer: Kenneth Obsequio
 *  GitHub: https://github.com/kenbusano
 *  License: MIT
 */

package client;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Login {
    @FXML
    private Button proceedBtn;

    @FXML
    private Button registerBtn;

    @FXML
    private void proceedBtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/main.css").toExternalForm());
        Stage stage = (Stage) proceedBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleRegister(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/Modal.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/main.css").toExternalForm());
        Stage stage = (Stage) registerBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

