package com.pencelab.tetrismaster.game;

import com.pencelab.tetrismaster.game.mechanics.*;
import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.pieces.Piece;
import com.pencelab.tetrismaster.stage.BlocksBoard;
import com.pencelab.tetrismaster.stage.IBoard;
import com.pencelab.tetrismaster.stage.TetrisBoard;

public final class GameFactory {

    public static IGame createNewTetrisGame(){
        IPiece.ISquareUnit[][] squareUnits = new Piece.SquareUnit[TetrisBoard.ROWS][TetrisBoard.COLUMNS];
        IBoard board = new TetrisBoard(squareUnits);
        IMechanics mechanics = new TetrisMechanics(board);
        return new Game(mechanics);
    }

    public static IGame createNewBlocksGame(){
        IPiece.ISquareUnit[][] squareUnits = new Piece.SquareUnit[BlocksBoard.ROWS][BlocksBoard.COLUMNS];
        IBoard board = new BlocksBoard(squareUnits);
        IMechanics mechanics = new BlocksMechanics(board);
        return new Game(mechanics);
    }

    private GameFactory(){
    }

}
