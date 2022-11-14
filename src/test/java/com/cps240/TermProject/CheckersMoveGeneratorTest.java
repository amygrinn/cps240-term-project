package com.cps240.TermProject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckersMoverGeneratorTest {

  @Test
  void new_board_has_7_moves() {
    CheckersMoveGenerator moveGenerator = new CheckersMoveGenerator();
    CheckersBoard board = new CheckersBoard();
    int numMoves = moveGenerator.generateMoves(board).length;
    Assertions.assertThat(numMoves).isEqualTo(7);
  }
}
