package com.pencelab.tetrismaster.game.mechanics;

import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.stage.IBoard;

public interface IMechanics extends Runnable {

    IBoard getBoard();
    IPiece getNextPiece();

    void init();
    void resume();
    void pause();
    void finish();

    void rotate();
    void moveLeft();
    void moveRight();
    void moveDown();
    void drop();
    void fetchPieces();

    void updateStats(final int...args);
    int[] getStats();
    void updateGravityWaitTime();

    void addBoardListener(final IBoard.Listener listener);
    void removeBoardListener(final IBoard.Listener listener);
    void clearBoardListeners();
}
