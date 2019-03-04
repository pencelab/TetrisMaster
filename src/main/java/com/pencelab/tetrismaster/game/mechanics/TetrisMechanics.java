package com.pencelab.tetrismaster.game.mechanics;

import com.pencelab.tetrismaster.common.Utils;
import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.stage.IBoard;

public class TetrisMechanics extends Mechanics {

    private static final long BASE_GRAVITY_WAIT_TIME_IN_MILLISECONDS = 2000;
    private static final int LINES_PER_LEVEL = 10;

    private int score = 0;
    private int lines = 0;
    private int level = 1;

    public TetrisMechanics(final IBoard board) {
        super(board);
    }

    @Override
    protected IPiece getRandomPiece() {
        return Utils.buildRandomTetrisPiece();
    }

    @Override
    public void updateStats(final int... args) {
        this.score += this.calculateScore(args[0]);
        this.lines += this.calculateLines(args[0]);
        this.level = this.calculateLevel(this.lines);
    }

    @Override
    public int[] getStats() {
        return new int[]{this.score, this.lines, this.level};
    }

    @Override
    public void updateGravityWaitTime() {
        double time = BASE_GRAVITY_WAIT_TIME_IN_MILLISECONDS;
        for(int i = 1; i < this.level; i++){
            time *= 0.75;
        }
        this.setGravityWaitTime(time);
    }

    private int calculateScore(final int points) {
        switch (points){
            case 1:
                return 10;
            case 2:
                return 25;
            case 3:
                return 45;
            case 4:
                return 70;
            default:
                throw new IllegalStateException("Illegal state at this moment. Making " + points + " points is not possible in this game.");
        }
    }

    private int calculateLevel(final int points) {
        return points / LINES_PER_LEVEL + 1;
    }

    private int calculateLines(final int points) {
        return points;
    }
}
