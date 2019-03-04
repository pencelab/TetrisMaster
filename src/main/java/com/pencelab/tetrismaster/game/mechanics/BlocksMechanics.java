package com.pencelab.tetrismaster.game.mechanics;

import com.pencelab.tetrismaster.common.Utils;
import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.stage.IBoard;

public class BlocksMechanics extends Mechanics {

    private static final long BASE_GRAVITY_WAIT_TIME_IN_MILLISECONDS = 2000;
    private static final int BLOCKS_PER_LEVEL = 10;

    private int score = 0;
    private int blocks = 0;
    private int level = 1;
    private int maxChain = 0;

    public BlocksMechanics(final IBoard board) {
        super(board);
    }

    @Override
    protected IPiece getRandomPiece() {
        return Utils.buildRandomBlocksPiece();
    }

    @Override
    public void updateStats(final int... args) {
        this.score += this.calculateScore(args[0], args[1]);
        this.blocks++;
        this.level = this.calculateLevel(this.blocks);
        this.maxChain = this.calculateMaxChain(args[1]);
    }

    @Override
    public int[] getStats() {
        return new int[]{this.score, this.blocks, this.level, this.maxChain};
    }

    @Override
    public void updateGravityWaitTime() {
        double time = BASE_GRAVITY_WAIT_TIME_IN_MILLISECONDS;
        for(int i = 1; i < this.level; i++){
            time *= 0.75;
        }
        this.setGravityWaitTime(time);
    }

    private int calculateScore(final int points, final int chain) {
        return points * chain;
    }

    private int calculateLevel(final int points) {
        return points / BLOCKS_PER_LEVEL + 1;
    }

    private int calculateMaxChain(final int chain) {
        return (this.maxChain < chain) ? chain : this.maxChain;
    }
}
