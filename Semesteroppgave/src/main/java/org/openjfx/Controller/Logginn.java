package org.openjfx.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.openjfx.MainApp;

import java.io.IOException;

public class Logginn {
    @FXML
    private PasswordField passord;

    @FXML
    private TextField brukernavn;


    @FXML
    void logginn(ActionEvent event) throws IOException {
        String brukernavnAdmin = "Admin123";
        String passordAdmin = "Admin123";
        String brukernavnBruker = "Bruker123";
        String passordBruker = "Bruker123";

        String logginnNavn = brukernavn.getText();
        String logginnPassord = passord.getText();
        if(logginnNavn.equals(brukernavnAdmin) && logginnPassord.equals(passordAdmin)){
            MainApp.setRoot("admin");
        }
        else if(logginnNavn.equals(brukernavnBruker) && logginnPassord.equals(passordBruker)){
            MainApp.setRoot("handlekurv");
        }

    }
}
