package com.pencelab.tetrismaster.controller;

import com.pencelab.tetrismaster.audio.ISoundManager;
import com.pencelab.tetrismaster.game.IGame;
import com.pencelab.tetrismaster.game.Settings;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class GameController implements IGameController, IGame.Listener {

    private final IGame game;
    private final ISoundManager soundManager;
    private boolean stopCounting = false;

    private final Set<Listener> listeners = new HashSet<>();

    public GameController(final IGame game, final ISoundManager soundManager){
        this.game = game;
        this.soundManager = soundManager;
        this.game.addListener(this);
    }

    //#region IGameController methods

    @Override
    public void start() {
        this.game.start();
    }

    @Override
    public void pause() {
        this.game.pause();
    }

    @Override
    public void resume() {
        this.game.resume();
    }

    @Override
    public void finish() {
        this.stopCounting = true;
        this.game.stop();
        this.game.removeListener(this);
    }

    @Override
    public void restart() {
        this.notifyRestart();
    }

    @Override
    public void close() {
        this.game.removeListener(this);
        this.finish();
        this.notifyClosed();
    }

    @Override
    public void startCountdown(final Callable<Void> action) {
        this.stopCounting = false;
        Thread countingThread = new Thread(() -> {
            for(int i = 3; i > 0 && !this.stopCounting; i--){
                soundManager.playCountingDownSoundEffect();
                this.notifyCountDownTic(i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(!this.stopCounting) {
                try {
                    soundManager.playStartSoundEffect();
                    action.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        countingThread.start();
    }

    @Override
    public void rotate() {
        this.game.rotate();
    }

    @Override
    public void moveLeft() {
        this.game.moveLeft();
    }

    @Override
    public void moveRight() {
        this.game.moveRight();
    }

    @Override
    public void moveDown() {
        this.game.moveDown();
    }

    @Override
    public void drop() {
        this.game.drop();
    }

    @Override
    public void enableMusic() {
        Settings.getInstance().enableMusic();
    }

    @Override
    public void disableMusic() {
        Settings.getInstance().disableMusic();
    }

    @Override
    public void enableSoundEffects() {
        Settings.getInstance().enableSfx();
    }

    @Override
    public void disableSoundEffects() {
        Settings.getInstance().disableSfx();
    }

    @Override
    public void enableShadow() {
        Settings.getInstance().enableShadow();
    }

    @Override
    public void disableShadow() {
        Settings.getInstance().disableShadow();
    }

    @Override
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

    //#endregion

    //#region IGame.Listener methods

    @Override
    public void pieceRotated() {
        this.soundManager.playPieceRotatedSoundEffect();
        this.notifyPieceRotated();
    }

    @Override
    public void pieceMoved() {
        this.notifyPieceMoved();
    }

    @Override
    public void pieceReleased() {
        this.soundManager.playPieceReleasedSoundEffect();
        this.notifyPieceReleased();
    }

    @Override
    public void boardRearranged() {
        this.notifyBoardRearranged();
    }

    @Override
    public void boardReady() {
        this.notifyBoardReady();
    }

    @Override
    public void scored(final int...args) {
        this.soundManager.playScoredSoundEffect(args);
        this.notifyScored();
    }

    @Override
    public void resumed() {
        this.soundManager.resume();
        this.notifyResumed();
    }

    @Override
    public void paused() {
        this.soundManager.pause();
        this.notifyPaused();
    }

    @Override
    public void gameOver() {
        this.soundManager.gameOver();
        this.notifyGameOver();
    }

    //#endregion

    private void notifyCountDownTic(int tic) {
        for(Listener listener : this.listeners){
            listener.countdownTic(tic);
        }
    }

    private void notifyRestart() {
        for(Listener listener : this.listeners){
            listener.restart();
        }
    }

    private void notifyClosed() {
        for(Listener listener : this.listeners){
            listener.closed();
        }
    }

    private void notifyPieceRotated() {
        for(Listener listener : this.listeners){
            listener.updateStage(this.game.getBoard());
        }
    }

    private void notifyPieceMoved() {
        for(Listener listener : this.listeners){
            listener.updateStage(this.game.getBoard());
        }
    }

    private void notifyPieceReleased() {
        for(Listener listener : this.listeners){
            listener.updateStage(this.game.getBoard());
        }
    }

    private void notifyBoardRearranged() {
        for(Listener listener : this.listeners){
            listener.updateStage(this.game.getBoard());
        }
    }

    private void notifyBoardReady() {
        for(Listener listener : this.listeners){
            listener.updateStage(this.game.getBoard());
            listener.updateNextPiece(this.game.getNextPiece());
        }
    }

    private void notifyScored(){
        for (Listener listener : this.listeners) {
            listener.updateStats(this.game.getStats());
        }
    }

    private void notifyResumed() {
        for(Listener listener : this.listeners){
            listener.resumed();
            listener.updateStage(this.game.getBoard());
            listener.updateNextPiece(this.game.getNextPiece());
            listener.updateStats(this.game.getStats());
        }
    }

    private void notifyPaused(){
        for(Listener listener : this.listeners){
            listener.paused();
        }
    }

    private void notifyGameOver(){
        for(Listener listener : this.listeners){
            listener.gameOver();
        }
    }
}
