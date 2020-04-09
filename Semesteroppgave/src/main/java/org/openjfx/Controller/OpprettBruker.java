package org.openjfx.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.openjfx.MainApp;

import java.io.IOException;

public class OpprettBruker {
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
    void SwitchToLogginn(ActionEvent event) throws IOException{
        MainApp.setRoot("login");
    }


    @FXML
    private void switchToHandleKurv() throws IOException {
        MainApp.setRoot("handlekurv");
    }

}
