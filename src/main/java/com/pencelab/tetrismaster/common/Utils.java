package com.pencelab.tetrismaster.common;

import com.pencelab.tetrismaster.pieces.*;

import java.awt.*;
import java.io.InputStream;
import java.util.Random;

public final class Utils {

    private Utils(){
    }

    public static int getRandomNumber(final int min, final int max){
        if(min >= max)
            throw new IllegalArgumentException("Min value must be lower than max value.");

        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static Font getFont(final String name) {
        Font font;
        String fName = "/fonts/" + name;
        try {
            InputStream is = Utils.class.getResourceAsStream(fName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println(fName + " not loaded.  Using serif font.");
            font = new Font("serif", Font.PLAIN, 14);
        }
        return font;
    }

    public static Color getRandomPieceColor(){
        int index = Utils.getRandomNumber(0, Globals.PieceColor.values().length - 1);
        return Globals.PieceColor.values()[index].getColor();
    }

    public static IPiece buildRandomTetrisPiece() {
        int index = Utils.getRandomNumber(0, Globals.TetrisPiece.values().length - 1);
        Globals.TetrisPiece p = Globals.TetrisPiece.values()[index];
        Piece piece;
        switch(p){
            case SQUARE:
                piece = new Square.Builder().build();
                break;
            case PIPE:
                piece = new Pipe.Builder().build();
                break;
            case T:
                piece = new T.Builder().build();
                break;
            case L:
                piece = new L.Builder().build();
                break;
            case LR:
                piece = new LR.Builder().build();
                break;
            case Z:
                piece = new Z.Builder().build();
                break;
            case ZR:
                piece = new ZR.Builder().build();
                break;
            default:
                throw new UnsupportedOperationException("Resulting Tetris piece [" + p.name() + "] cannot be built because case has not been contemplated in the switch-case block.");
        }
        return piece;
    }

    public static IPiece buildRandomBlocksPiece() {
        int index = Utils.getRandomNumber(0, Globals.BlocksPiece.values().length - 1);
        Globals.BlocksPiece p = Globals.BlocksPiece.values()[index];

        Color pieceColor1 = getRandomPieceColor();
        Color pieceColor2 = getRandomPieceColor();

        Piece piece;
        switch(p){
            case SQUARE:
                piece = new Square.Builder().inColor(pieceColor1).build();
                break;
            case PIPE:
                piece = new Pipe.Builder().inColor(pieceColor1).build();
                break;
            case T:
                piece = new T.Builder().inColor(pieceColor1).build();
                break;
            case L:
                piece = new L.Builder().inColor(pieceColor1).build();
                break;
            case LR:
                piece = new LR.Builder().inColor(pieceColor1).build();
                break;
            case Z:
                piece = new Z.Builder().inColor(pieceColor1).build();
                break;
            case ZR:
                piece = new ZR.Builder().inColor(pieceColor1).build();
                break;
            case BLOCK:
                piece = new Block.Builder().inColors(new Color[]{pieceColor1, pieceColor2}).build();
                break;
            default:
                throw new UnsupportedOperationException("Resulting Blocks piece [" + p.name() + "] cannot be built because case has not been contemplated in the switch-case block.");
        }
        return piece;
    }
}
