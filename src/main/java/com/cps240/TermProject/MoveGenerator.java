package com.cps240.TermProject;

public abstract class MoveGenerator<M extends Move, B extends Board<M>> {
  /**
   * Returns an array of valid moves for the given board.
   *
   * <p>These moves can be passed to the {@link com.cps240.TermProject.Game#makeMove(Move)} method.
   *
   * @param board A board in a valid state
   * @return An array of valid moves
   */
  abstract M[] generateMoves(B board);
}
