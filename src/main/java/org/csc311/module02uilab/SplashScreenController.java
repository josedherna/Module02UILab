package org.csc311.module02uilab;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.io.InputStream;

public class SplashScreenController implements Runnable {
    @FXML
    private ProgressBar loadingProgress;
    @FXML
    private ImageView backgroundImageView;
    @FXML
    private VBox rootVbox;

    private static final String SPLASH_SCREEN = "/images/wallpaper-farmingdale-state-college.jpg";
    private static final InputStream IMAGE_STREAM = SplashScreenController.class.getResourceAsStream(SPLASH_SCREEN);

    public void initializeSplash() {
        if (IMAGE_STREAM != null) {
            backgroundImageView.setImage(new Image(IMAGE_STREAM));
            Thread backgroundThread = new Thread(this);
            backgroundThread.start();
        }
    }

    @Override
    public void run() {
        loadingProgress.setProgress(.25);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Splash screen interrupted");
        }
        loadingProgress.setProgress(.50);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Splash screen interrupted");
        }
        loadingProgress.setProgress(.75);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Splash screen interrupted");
        }
        loadingProgress.setProgress(1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Splash screen interrupted");
        }
//        FXMLLoader loginLoader = new FXMLLoader(SplashScreenController.class.getResource("loginscreen-view.fxml"));
//        Parent loginScreen = null;
//        try {
//            loginScreen = loginLoader.load();
//        } catch (IOException e) {
//            System.out.println("Splash screen interrupted");
//        }
//        Scene currentScene = rootVbox.getScene();
//        currentScene.setRoot(loginScreen);
    }
}