package com.cps240.TermProject;

public class HangmanBoard extends Board<HangmanMove> {
  @Override
  public void makeMove(HangmanMove move) throws InvalidMoveException {
    super.makeMove(move);
  }

  @Override
  public void unmakeMove(HangmanMove move) {
    super.unmakeMove(move);
  }

  @Override
  public boolean isComplete() {
    return false;
  }
}
