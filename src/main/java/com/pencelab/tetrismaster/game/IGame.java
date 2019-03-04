package com.pencelab.tetrismaster.game;

import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.stage.IBoard;

public interface IGame {

    interface Listener {
        void pieceRotated();
        void pieceMoved();
        void pieceReleased();
        void boardRearranged();
        void boardReady();
        void scored(final int...args);
        void resumed();
        void paused();
        void gameOver();
    }

    IBoard getBoard();
    IPiece getNextPiece();
    int[] getStats();

    void addListener(final Listener listener);
    void removeListener(final Listener listener);
    void clearAllListeners();

    void start();
    void resume();
    void pause();
    void stop();

    void rotate();
    void moveDown();
    void moveLeft();
    void moveRight();
    void drop();
}
