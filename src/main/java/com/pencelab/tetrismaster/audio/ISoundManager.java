package com.pencelab.tetrismaster.audio;

import com.pencelab.tetrismaster.game.Settings;

public interface ISoundManager extends Settings.AudioListener{
    void playCountingDownSoundEffect();
    void playStartSoundEffect();
    void playPieceRotatedSoundEffect();
    void playPieceReleasedSoundEffect();
    void playScoredSoundEffect(final int...args);
    void resume();
    void pause();
    void gameOver();
}
