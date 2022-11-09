package com.cps240.TermProject;

import java.util.Stack;

public abstract class Board<M extends Move> {
  private MoveGenerator<M, Board<M>> moveGenerator;

  protected Stack<M> moves;
  protected boolean turn = false;

  protected void unmakeMove(M move) {
    turn = !turn;
  }

  public abstract boolean isComplete();

  public boolean getTurn() {
    return turn;
  }

  public M[] generateMoves() {
    return moveGenerator.generateMoves(this);
  }

  public void makeMove(M move) throws InvalidMoveException {
    if (move.isValid()) {
      moves.push(move);
      turn = !turn;
    } else {
      throw new InvalidMoveException(move);
    }
  }

  public void undo() {
    if (moves.size() > 0) {
      unmakeMove(moves.pop());
    }
  }
}
