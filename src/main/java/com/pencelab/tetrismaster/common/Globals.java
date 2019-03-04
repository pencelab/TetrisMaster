package com.pencelab.tetrismaster.common;

import java.awt.Color;

public final class Globals {

    public static String[] tetrisStats = {"Score", "Lines", "Level"};
    public static String[] blocksStats = {"Score", "Blocks", "Level", "Max. Chain"};

    public enum Game{
        TETRIS,
        BLOCKS
    }

    public enum TetrisPiece{
        SQUARE,
        PIPE,
        T,
        L,
        LR,
        Z,
        ZR
    }

    public enum BlocksPiece{
        SQUARE,
        PIPE,
        T,
        L,
        LR,
        Z,
        ZR,
        BLOCK
    }

    public enum PieceColor{
        PURPLE(new Color(170, 0, 255)),
        YELLOW(new Color(255, 214, 0)),
        RED(new Color(213, 0, 0)),
        BLUE(new Color(41, 98, 255)),
        TEAL(new Color(0, 191, 165)),
        LIME(new Color(174, 234, 0)),
        ORANGE(new Color(255, 109, 0));

        private final Color color;

        PieceColor(Color color) {
            this.color = color;
        }

        public Color getColor(){
            return this.color;
        }
    }

    private Globals(){
    }

}
