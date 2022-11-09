package com.cps240.TermProject;

public class CheckersMove extends Move {
  private int fromSquare;
  private int toSquare;

  public int getFromSquare() {
    return fromSquare;
  }

  public int getToSquare() {
    return toSquare;
  }

  @Override
  public boolean isValid() {
    return fromSquare >= 0 && toSquare >= 0;
  }
}
