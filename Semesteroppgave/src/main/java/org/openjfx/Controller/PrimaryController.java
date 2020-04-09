package org.openjfx.Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.openjfx.MainApp;
import javafx.fxml.FXML;




public class PrimaryController {
    @FXML
    private ImageView imageView;

    @FXML
    void switchAdmin(ActionEvent event) throws IOException {
        MainApp.setRoot("login");

    }

    @FXML
    void switchOpprettBruker(ActionEvent event) throws IOException{
        MainApp.setRoot("opprettbruker");

    }

}
