package com.cps240.TermProject;

public class CheckersBoard extends Board<CheckersMove> {
  @Override
  public void makeMove(CheckersMove move) throws InvalidMoveException {
    super.makeMove(move);
  }

  @Override
  public void unmakeMove(CheckersMove move) {
    super.unmakeMove(move);
  }

  @Override
  public boolean isComplete() {
    return false;
  }
}
