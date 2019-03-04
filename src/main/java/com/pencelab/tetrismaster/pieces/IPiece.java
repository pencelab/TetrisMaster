package com.pencelab.tetrismaster.pieces;

import java.awt.Color;

public interface IPiece {

    IPiece.ISquareUnit[] getSquareUnits();
    IPiece.ISquareUnit[] getLinkedSquareUnits();
    IPiece rotate();
    IPiece moveLeft();
    IPiece moveRight();
    IPiece moveDown();

    interface ISquareUnit {
        int getX();
        int getY();
        Color getColor();
    }
}
