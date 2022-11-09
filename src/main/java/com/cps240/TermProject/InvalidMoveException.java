package com.cps240.TermProject;

public class InvalidMoveException extends RuntimeException {
  public InvalidMoveException(Move move) {
    super("Invalid move: " + move.toString());
  }
}
