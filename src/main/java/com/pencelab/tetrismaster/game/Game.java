package com.pencelab.tetrismaster.game;

import com.pencelab.tetrismaster.game.mechanics.IMechanics;
import com.pencelab.tetrismaster.pieces.*;
import com.pencelab.tetrismaster.stage.IBoard;

import java.util.ArrayList;
import java.util.List;

public class Game implements IGame, IBoard.Listener {

    private final IMechanics mechanics;

    private List<Listener> listeners = new ArrayList<>();

    public Game(final IMechanics mechanics){
        this.mechanics = mechanics;
        this.mechanics.addBoardListener(this);
    }

    //#region IGame methods

    @Override
    public IBoard getBoard() {
        return this.mechanics.getBoard();
    }

    @Override
    public IPiece getNextPiece() {
        return this.mechanics.getNextPiece();
    }

    @Override
    public int[] getStats() {
        return this.mechanics.getStats();
    }

    public void addListener(final Listener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removeListener(final Listener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void clearAllListeners() {
        this.listeners.clear();
    }

    @Override
    public void start() {
        this.mechanics.init();
        this.notifyResumed();
        Thread gravity = new Thread(this.mechanics);
        gravity.start();
    }

    @Override
    public void resume() {
        this.mechanics.resume();
        this.notifyResumed();
    }

    @Override
    public void pause() {
        this.mechanics.pause();
        this.notifyPaused();
    }

    @Override
    public void stop() {
        this.mechanics.removeBoardListener(this);
        this.finish();
    }

    @Override
    public void rotate() {
        this.mechanics.rotate();
    }

    @Override
    public void moveDown() {
        this.mechanics.moveDown();
    }

    @Override
    public void moveLeft() {
        this.mechanics.moveLeft();
    }

    @Override
    public void moveRight() {
        this.mechanics.moveRight();
    }

    @Override
    public void drop() {
        this.mechanics.drop();
    }

    //#endregionn

    //#region IBoard.Listener methods

    @Override
    public void pieceRotated() {
        this.notifyPieceRotated();
    }

    @Override
    public void pieceMoved() {
        this.notifyPieceMoved();
    }

    @Override
    public void pieceReleased() {
        this.notifyPieceReleased();
    }

    @Override
    public void rearranged() {
        this.notifyBoardRearranged();
    }

    @Override
    public void idleState() {
        this.mechanics.fetchPieces();
        this.notifyBoardReady();
    }

    @Override
    public void scored(final int...args) {
        this.mechanics.updateStats(args);
        this.mechanics.updateGravityWaitTime();
        this.notifyScored(args);
    }

    @Override
    public void gameOver() {
        this.finish();
    }

    //#endregion

    private void finish(){
        this.mechanics.finish();
        this.notifyGameOver();
    }

    private void notifyResumed() {
        for (Listener listener : this.listeners) {
            listener.resumed();
        }
    }

    private void notifyPaused(){
        for (Listener listener : this.listeners) {
            listener.paused();
        }
    }

    private void notifyGameOver(){
        for (Listener listener : this.listeners) {
            listener.gameOver();
        }
    }

    private void notifyPieceRotated(){
        for (Listener listener : this.listeners) {
            listener.pieceRotated();
        }
    }

    private void notifyPieceMoved(){
        for (Listener listener : this.listeners) {
            listener.pieceMoved();
        }
    }

    private void notifyPieceReleased(){
        for (Listener listener : this.listeners) {
            listener.pieceReleased();
        }
    }

    private void notifyBoardRearranged(){
        for (Listener listener : this.listeners) {
            listener.boardRearranged();
        }
    }

    private void notifyBoardReady() {
        for (Listener listener : this.listeners) {
            listener.boardReady();
        }
    }

    private void notifyScored(final int...args){
        for (Listener listener : this.listeners) {
            listener.scored(args);
        }
    }
}
