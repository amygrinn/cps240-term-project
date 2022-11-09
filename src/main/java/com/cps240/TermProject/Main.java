package com.cps240.TermProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) {
    // Declaring variables
    GridPane gridPane;
    Label label;
    Scene sc;
    Button hangmanButton;
    Button checkersButton;
    Button connectFourButton;

    // Initialize the buttons
    hangmanButton = new Button("Hangman");
    checkersButton = new Button("Checkers");
    connectFourButton = new Button("Connect Four");

    // Have three buttons, Hangman, Checkers and ConnectFour, use button action to
    // move onto Game

    // Start of Hangman game selection
    hangmanButton.setOnAction(
        new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
            Game.Hangman();
          }
        });

    // Start of Checkers game selection
    checkersButton.setOnAction(
        new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
            Game.Checkers();
          }
        });

    // Start of ConnectFour game selection
    connectFourButton.setOnAction(
        new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
            Game.ConnectFour();
          }
        });

    // Set name of window
    primaryStage.setTitle("Game Launcher");

    // Label for primary stage
    label = new Label("Select a game from below:");

    // Initialize GridPane
    gridPane = new GridPane();

    // Draws out the GridPane -- Use for debugging etc.
    // gridPane.setGridLinesVisible(true);

    // Setting max width of buttons so that they allign
    hangmanButton.setMaxWidth(220);
    checkersButton.setMaxWidth(220);
    connectFourButton.setMaxWidth(220);

    // Center GridPane top down
    gridPane.setAlignment(Pos.TOP_CENTER);
    // Vertical gap between button
    gridPane.setVgap(10);
    // Mostly using to limit the max height and bottom of buttons and label
    gridPane.setPadding(new Insets(25, 25, 25, 25));

    // Adding to GridPane -- All in the same column (1) but different rows (1-4)
    gridPane.add(label, 1, 1);
    gridPane.add(connectFourButton, 1, 2);
    gridPane.add(checkersButton, 1, 3);
    gridPane.add(hangmanButton, 1, 4);

    // Initialize scene with gridPane
    sc = new Scene(gridPane, 300, 200);

    // Set and show primaryStage
    primaryStage.setScene(sc);
    primaryStage.show();

  }

  public static void main(String[] args) {
    launch(args);
  }
}
