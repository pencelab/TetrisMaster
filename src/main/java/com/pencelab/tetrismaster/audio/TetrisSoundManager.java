package com.pencelab.tetrismaster.audio;

import com.pencelab.tetrismaster.game.Settings;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public final class TetrisSoundManager implements ISoundManager {

    private static final int SFX_ROTATION = 0;
    private static final int SFX_RELEASE = 1;
    private static final int SFX_SCORED_1_2_3 = 2;
    private static final int SFX_SCORED_4 = 3;
    private static final int SFX_COUNT_3_2_1 = 4;
    private static final int SFX_START = 5;
    private static final int SFX_GAME_OVER = 6;

    private final SoundPlayer soundPlayer;
    private final MusicPlayer musicPlayer;

    private static TetrisSoundManager tetrisSoundManager = null;

    private final String[] soundEffects = {
            "sfx_rotation.mp3",
            "sfx_release.mp3",
            "sfx_scored_1-2-3.mp3",
            "sfx_scored_4.mp3",
            "sfx_count_3-2-1.mp3",
            "sfx_start.mp3",
            "sfx_game_over.mp3"
    };

    private final String music = "tetris.mp3";

    private boolean gameRunning = false;

    private TetrisSoundManager() {
        this.soundPlayer = new SoundPlayer(this.soundEffects);
        this.musicPlayer = new MusicPlayer(this.music);
        Settings.getInstance().addListener(this);
    }

    public static synchronized TetrisSoundManager getInstance() {
        if(tetrisSoundManager == null)
            tetrisSoundManager = new TetrisSoundManager();

        return tetrisSoundManager;
    }

    @Override
    public void playCountingDownSoundEffect(){
        this.playSoundEffect(SFX_COUNT_3_2_1);
    }

    @Override
    public void playStartSoundEffect(){
        this.playSoundEffect(SFX_START);
    }

    @Override
    public void playPieceRotatedSoundEffect() {
        this.playSoundEffect(SFX_ROTATION);
    }

    @Override
    public void playPieceReleasedSoundEffect() {
        this.playSoundEffect(SFX_RELEASE);
    }

    @Override
    public void playScoredSoundEffect(final int...args) {
        if (args[0] == 4)
            this.playSoundEffect(SFX_SCORED_4);
        else
            this.playSoundEffect(SFX_SCORED_1_2_3);
    }

    @Override
    public void resume() {
        this.gameRunning = true;
        this.playMusic();
    }

    @Override
    public void pause() {
        this.gameRunning = false;
        try {
            this.musicPlayer.pause();
        } catch (BasicPlayerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void gameOver() {
        this.gameRunning = false;
        try {
            this.musicPlayer.stop();
            this.playSoundEffect(SFX_GAME_OVER);
        } catch (BasicPlayerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void musicEnabled() {
        if(this.gameRunning)
            this.playMusic();
    }

    @Override
    public void musicDisabled() {
        try {
            this.musicPlayer.stop();
        } catch (BasicPlayerException e) {
            e.printStackTrace();
        }
    }

    private void playMusic(){
        if(Settings.getInstance().isMusicEnabled()) {
            try {
                this.musicPlayer.play(true);
            } catch (BasicPlayerException e) {
                e.printStackTrace();
            }
        }
    }

    private void playSoundEffect(final int index){
        if(Settings.getInstance().isSfxEnabled())
            this.soundPlayer.play(index);
    }
}
