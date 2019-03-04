package com.pencelab.tetrismaster.controller;

import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.stage.IBoard;

import java.util.concurrent.Callable;

public interface IGameController {

    interface Listener {
        void updateStats(int...args);
        void updateStage(final IBoard board);
        void updateNextPiece(final IPiece piece);
        void resumed();
        void paused();
        void gameOver();
        void restart();
        void closed();
        void countdownTic(final int number);
    }

    void start();
    void pause();
    void resume();
    void finish();
    void restart();
    void close();

    void startCountdown(final Callable<Void> action);

    void rotate();
    void moveLeft();
    void moveRight();
    void moveDown();
    void drop();

    void enableMusic();
    void disableMusic();
    void enableSoundEffects();
    void disableSoundEffects();
    void enableShadow();
    void disableShadow();

    void addListener(Listener listener);
    void removeListener(Listener listener);
    void clearAllListeners();
}
