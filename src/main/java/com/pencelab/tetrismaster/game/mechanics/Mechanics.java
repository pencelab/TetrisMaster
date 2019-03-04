package com.pencelab.tetrismaster.game.mechanics;

import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.stage.IBoard;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class Mechanics implements IMechanics {

    private final IBoard board;
    private IPiece nextPiece;
    private boolean gameOver = true;
    private boolean paused = true;
    private long gravityWaitTime;

    private Thread userActionThread = null;

    protected abstract IPiece getRandomPiece();

    Mechanics(final IBoard board){
        this.board = board;
    }

    @Override
    public IBoard getBoard() {
        return this.board;
    }

    @Override
    public IPiece getNextPiece() {
        return this.nextPiece;
    }

    @Override
    public void init() {
        this.getBoard().setPiece(this.getRandomPiece());
        this.setNextPiece(this.getRandomPiece());
        this.updateGravityWaitTime();
        this.setGameOver(false);
    }

    @Override
    public void resume() {
        this.setPaused(false);
    }

    @Override
    public void pause() {
        this.setPaused(true);
    }

    @Override
    public void finish() {
        this.setGameOver(true);
    }

    @Override
    public void rotate() {
        this.executeUserAction(() -> {
            this.getBoard().rotate();
            return null;
        });
    }

    @Override
    public void moveLeft() {
        this.executeUserAction(() -> {
            this.getBoard().moveLeft();
            return null;
        });
    }

    @Override
    public void moveRight() {
        this.executeUserAction(() -> {
            this.getBoard().moveRight();
            return null;
        });
    }

    @Override
    public void moveDown() {
        this.executeUserAction(() -> {
            this.getBoard().moveDown();
            return null;
        });
    }

    @Override
    public void drop() {
        this.executeUserAction(() -> {
            this.getBoard().drop();
            return null;
        });
    }

    @Override
    public void fetchPieces() {
        this.getBoard().setPiece(this.getNextPiece());
        this.setNextPiece(this.getRandomPiece());
    }

    @Override
    public void addBoardListener(final IBoard.Listener listener) {
        this.getBoard().addListener(listener);
    }

    @Override
    public void removeBoardListener(final IBoard.Listener listener) {
        this.getBoard().removeListener(listener);
    }

    @Override
    public void clearBoardListeners() {
        this.getBoard().clearAllListeners();
    }

    private void setNextPiece(final IPiece piece){
        this.nextPiece = piece;
    }

    private boolean gameOver() {
        return gameOver;
    }

    private void setGameOver(final boolean gameOver) {
        this.gameOver = gameOver;
    }

    private boolean paused() {
        return paused;
    }

    private void setPaused(final boolean paused) {
        this.paused = paused;
    }

    private long getGravityWaitTime(){
        return this.gravityWaitTime;
    }

    protected void setGravityWaitTime(final double time) {
        this.gravityWaitTime = (long) time;
    }

    private void executeUserAction(Callable<Void> action){
        if(!this.gameOver() && !this.paused()){
            if(this.userActionThread == null || !this.userActionThread.isAlive()){
                this.userActionThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            action.call();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                this.userActionThread.start();
            }
        }
    }

    @Override
    public void run() {
        this.resume();
        while(!this.gameOver()){
            if(!this.paused())
                this.board.moveDown();
            try {
                TimeUnit.MILLISECONDS.sleep(this.getGravityWaitTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
