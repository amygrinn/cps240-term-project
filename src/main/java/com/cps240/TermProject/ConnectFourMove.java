package com.cps240.TermProject;

public class ConnectFourMove extends Move {
  private int column;

  public int getColumn() {
    return column;
  }

  @Override
  public boolean isValid() {
    return column >= 0;
  }
}
