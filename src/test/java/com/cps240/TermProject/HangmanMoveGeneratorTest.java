package com.cps240.TermProject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HangmanMoverGeneratorTest {

  private HangmanMoveGenerator moveGenerator = new HangmanMoveGenerator();

  @Test
  void new_board_has_26_moves() {
    HangmanBoard board = new HangmanBoard();
    int numMoves = moveGenerator.generateMoves(board).length;
    Assertions.assertThat(numMoves).isEqualTo(26);
  }

  @Test
  void board_has_25_letters_after_move() {
    HangmanBoard board = new HangmanBoard();
    board.makeMove(moveGenerator.generateMoves(board)[0]);
    int numMoves = moveGenerator.generateMoves(board).length;
    Assertions.assertThat(numMoves).isEqualTo(25);
  }
}
