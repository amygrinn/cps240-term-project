package com.cps240.TermProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) {

    Label label;
    TextField tf;
    Button button;
    VBox vbox;
    Scene scene;

    tf = new TextField("Text Field!");
    tf.setMaxWidth(200);

    label = new Label("Please Select Your Game");
    button = new Button("Connect 4");

    button.setOnAction(
        new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
            label.setText(tf.getText());
          }
        });

    vbox = new VBox(label, tf, button);
    vbox.setSpacing(20);
    vbox.setAlignment(Pos.CENTER);
    scene = new Scene(vbox, 300, 200);

    primaryStage.setTitle("Game Launcher");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
