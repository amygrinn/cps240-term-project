package com.cps240.TermProject;

import javafx.stage.Stage;

public abstract class Game<M extends Move> {
  private Stage stage;
  protected Board<M> board;

  protected abstract void updateStage(Stage stage);

  protected abstract void displayMoves(Stage stage, M[] moves);

  protected abstract void displayWin(Stage stage);

  public void start(Stage stage) {
    this.stage = stage;
    updateStage(stage);
    displayMoves(stage, board.generateMoves());
  }

  public void makeMove(M move) {
    try {
      board.makeMove(move);
    } catch (InvalidMoveException ime) {
      // TODO: do something
    }

    updateStage(stage);

    if (board.isComplete()) displayWin(stage);
    else displayMoves(stage, board.generateMoves());
  }

  public void undo() {
    board.undo();
    updateStage(stage);
    displayMoves(stage, board.generateMoves());
  }

  // Using the selection from the first menu, initiate the game that was selected

  // Hangman
  public static void Hangman() {
    // TODO: do something
  }

  // Checkers
  public static void Checkers() {
    // TODO: do something
  }

  // ConnectFour
  public static void ConnectFour() {
    // TODO: do something
  }
}
