package org.openjfx.Controller;

import java.io.IOException;
import org.openjfx.MainApp;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        MainApp.setRoot("primary");
    }
}