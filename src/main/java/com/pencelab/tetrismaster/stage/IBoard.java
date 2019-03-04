package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.pieces.IPiece;

public interface IBoard {

    interface Listener{
        void pieceRotated();
        void pieceMoved();
        void pieceReleased();
        void rearranged();
        void idleState();
        void scored(final int...args);
        void gameOver();
    }

    IPiece.ISquareUnit[][] getSquareUnits();
    IPiece getPiece();
    IPiece getShadowPiece();
    void setPiece(final IPiece piece);
    void rotate();
    void moveDown();
    void moveLeft();
    void moveRight();
    void drop();

    void addListener(final Listener listener);
    void removeListener(final Listener listener);
    void clearAllListeners();

    int getColumns();
    int getRows();
    int getHiddenRows();
}
