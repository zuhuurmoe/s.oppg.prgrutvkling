package org.openjfx.Controller;

import java.io.IOException;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.openjfx.MainApp;
import javafx.fxml.FXML;




public class PrimaryController {

    @FXML
    private TextField fornavn;

    @FXML
    private TextField brukernavn;

    @FXML
    private TextField epost;

    @FXML
    private TextField etternavn;

    @FXML
    private PasswordField passord;

    @FXML
    private ImageView imageView;

    @FXML
    private Button registerer;

    @FXML
    private void switchToSecondary() throws IOException {
        MainApp.setRoot("secondary");
    }

}
