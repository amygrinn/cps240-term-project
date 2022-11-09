package com.cps240.TermProject;

import javafx.stage.Stage;

public abstract class Game<M extends Move, B extends Board<M>> {
  private Stage stage;
  private B board;

  /**
   * Display a board on a given stage.
   *
   * <p>This method will clear all existing game elements from the stage (including those generated
   * by {@link com.cps240.TermProject.Game#displayChoices(Stage, Move[])}), then add game pieces to
   * the stage according to the board passed in.
   *
   * @param stage The stage to update
   * @param board The current board state
   */
  protected abstract void displayBoard(Stage stage, B board);

  /**
   * Display all possible choices a player has.
   *
   * <p>This method will create a JavaFX graphical interface for choosing between all possible
   * moves. Each button will call {@link com.cps240.TermProject.Game#makeMove(Move)} with the
   * selected move.
   *
   * @param stage The stage to add elements to
   * @param moves An array of all possible moves
   */
  protected abstract void displayChoices(Stage stage, M[] moves);

  /**
   * Display the win status of a board.
   *
   * <p>This method will show, on the stage, whether or not the current player won the game.
   *
   * @param stage The stage to update
   * @param board The completed board
   */
  protected abstract void displayWin(Stage stage, B board);

  /**
   * Start a new game.
   *
   * @param stage The stage to display the game in
   */
  public void start(Stage stage) {
    this.stage = stage;
    displayBoard(stage, board);
    displayChoices(stage, board.generateMoves());
  }

  /**
   * Make a move.
   *
   * <p>This method will update the displayed board and show available choices for the next move.
   *
   * @param move The move a player or AI wants to make
   */
  public void makeMove(M move) {
    try {
      board.makeMove(move);
    } catch (InvalidMoveException ime) {
      // TODO: do something
    }

    displayBoard(stage, board);

    if (board.isComplete()) displayWin(stage, board);
    else displayChoices(stage, board.generateMoves());
  }

  /**
   * Undo the latest move.
   *
   * <p>Called repeatedly, this will undo earlier moves.
   */
  public void undo() {
    board.undo();
    displayBoard(stage, board);
    displayChoices(stage, board.generateMoves());
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
