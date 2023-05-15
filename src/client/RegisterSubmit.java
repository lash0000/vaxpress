package client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.stage.Stage;

public class RegisterSubmit {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField fullName;
    @FXML
    private TextField contactNum;
    @FXML
    private DatePicker birthday;
    @FXML
    private TextField birthPlace;
    @FXML
    private Button proceedBtn;

    @FXML
    private void proceedNext(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/RegisterPt2.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/main.css").toExternalForm());
        Stage stage = (Stage) proceedBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
