package com.pencelab.tetrismaster.audio;

import com.pencelab.tetrismaster.game.Settings;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public final class BlocksSoundManager implements ISoundManager {

    private static final int SFX_ROTATION = 0;
    private static final int SFX_RELEASE = 1;
    private static final int SFX_SCORED_1 = 2;
    private static final int SFX_SCORED_2 = 3;
    private static final int SFX_SCORED_3 = 4;
    private static final int SFX_SCORED_4 = 5;
    private static final int SFX_SCORED_5 = 6;
    private static final int SFX_SCORED_6 = 7;
    private static final int SFX_SCORED_7 = 8;
    private static final int SFX_COUNT_3_2_1 = 9;
    private static final int SFX_START = 10;
    private static final int SFX_GAME_OVER = 11;

    private final SoundPlayer soundPlayer;
    private final MusicPlayer musicPlayer;

    private static BlocksSoundManager blocksSoundManager = null;

    private final String[] soundEffects = {
            "sfx_rotation.mp3",
            "sfx_release.mp3",
            "sfx_concrete_break_01.mp3",
            "sfx_concrete_break_02.mp3",
            "sfx_concrete_break_03.mp3",
            "sfx_concrete_break_04.mp3",
            "sfx_concrete_break_05.mp3",
            "sfx_concrete_break_06.mp3",
            "sfx_grenade.mp3",
            "sfx_count_3-2-1.mp3",
            "sfx_start.mp3",
            "sfx_game_over.mp3"
    };

    private final String music = "blocks.mp3";

    private boolean gameRunning = false;

    private BlocksSoundManager() {
        this.soundPlayer = new SoundPlayer(this.soundEffects);
        this.musicPlayer = new MusicPlayer(this.music);
        Settings.getInstance().addListener(this);
    }

    public static synchronized BlocksSoundManager getInstance() {
        if(blocksSoundManager == null)
            blocksSoundManager = new BlocksSoundManager();

        return blocksSoundManager;
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
        switch(args[1]){
            case 1:
                this.playSoundEffect(SFX_SCORED_1);
                break;
            case 2:
                this.playSoundEffect(SFX_SCORED_2);
                break;
            case 3:
                this.playSoundEffect(SFX_SCORED_3);
                break;
            case 4:
                this.playSoundEffect(SFX_SCORED_4);
                break;
            case 5:
                this.playSoundEffect(SFX_SCORED_5);
                break;
            case 6:
                this.playSoundEffect(SFX_SCORED_6);
                break;
            default:
                this.playSoundEffect(SFX_SCORED_7);
                break;
        }
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
