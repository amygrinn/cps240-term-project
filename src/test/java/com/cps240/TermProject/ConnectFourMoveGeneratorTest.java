package com.cps240.TermProject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ConnectFourMoveGeneratorTest {

  private ConnectFourMoveGenerator moveGenerator = new ConnectFourMoveGenerator();

  @Test
  void new_board_has_7_moves() {
    ConnectFourBoard board = new ConnectFourBoard();
    int numMoves = moveGenerator.generateMoves(board).length;
    Assertions.assertThat(numMoves).isEqualTo(7);
  }

  @Test
  void board_has_6_moves_after_column_filled() {
    ConnectFourBoard board = new ConnectFourBoard();
    // Fill first column
    for (int i = 0; i < 6; i++) board.makeMove(moveGenerator.generateMoves(board)[0]);
    int numMoves = moveGenerator.generateMoves(board).length;
    Assertions.assertThat(numMoves).isEqualTo(6);
  }
}
