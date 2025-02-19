package org.csc311.module02uilab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class StartApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("splashscreen-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        SplashScreenController splashScreen = fxmlLoader.getController();
        splashScreen.initializeSplash();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}