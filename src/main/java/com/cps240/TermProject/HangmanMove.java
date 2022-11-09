package com.cps240.TermProject;

public class HangmanMove extends Move {
  private char letter;

  public char getLetter() {
    return letter;
  }

  @Override
  public boolean isValid() {
    return letter >= 'A' && letter <= 'Z';
  }
}
