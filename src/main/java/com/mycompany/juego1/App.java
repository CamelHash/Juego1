package com.mycompany.juego1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    int ladoImagen= 256;
// for (int i = 0; i < 5; ++i) {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        var scene = new Scene (root, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Image background = new Image(getClass().getResourceAsStream("/Images/background.png"));
        ImageView  imageView1 = new ImageView (background);
        root.getChildren().add(imageView1);
        ImageView  imageView2 = new ImageView (background);
        root.getChildren().add(imageView2);
        imageView2.setX(ladoImagen);
        imageView2.setX(ladoImagen);
    }

    public static void main(String[] args) {
        launch();
    }

}