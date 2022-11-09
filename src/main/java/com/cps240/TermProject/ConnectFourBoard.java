package com.cps240.TermProject;

public class ConnectFourBoard extends Board<ConnectFourMove> {
  @Override
  public void makeMove(ConnectFourMove move) throws InvalidMoveException {
    super.makeMove(move);
  }

  @Override
  public void unmakeMove(ConnectFourMove move) {
    super.unmakeMove(move);
  }

  @Override
  public boolean isComplete() {
    return false;
  }
}
