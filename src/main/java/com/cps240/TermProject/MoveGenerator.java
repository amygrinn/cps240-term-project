package com.cps240.TermProject;

public abstract class MoveGenerator<M extends Move, B extends Board<M>> {
  abstract M[] generateMoves(B board);
}
