package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
/**
 * JavaFX org.semesteroppgave.org.semesteroppgave.Controller.App
 */
public class MainApp extends Application {
        private static Scene scene;

        @Override
        public void start(Stage stage) throws IOException {
            scene = new Scene(loadFXML("primary"));
            stage.setTitle("Lag din egen datamaskin");
            stage.setScene(scene);
            stage.show();
        }

        public static void setRoot(String fxml) throws IOException {
            scene.setRoot(loadFXML(fxml));
        }

        private static Parent loadFXML(String fxml) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(org.openjfx.MainApp.class.getResource(fxml + ".fxml"));
            return fxmlLoader.load();
        }

        public static void main(String[] args) {
            launch();
        }

    }

