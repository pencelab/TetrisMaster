package com.pencelab.tetrismaster.audio;

import com.pencelab.tetrismaster.common.Utils;
import javazoom.jlgui.basicplayer.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public final class MusicPlayer implements BasicPlayerListener {

    private BasicPlayer music;
    private boolean loop = false;

    private final String filename;

    MusicPlayer(final String filename) {
        this.filename = filename;
        this.initMusic();
    }

    void play(final boolean loop) throws BasicPlayerException {
        this.loop = loop;
        switch(this.music.getStatus()){
            case BasicPlayer.PAUSED:
                this.music.resume();
                break;
            case BasicPlayer.STOPPED:
                this.initMusic();
            case BasicPlayer.OPENED:
                this.music.play();
                break;
        }
    }

    public void pause() throws BasicPlayerException {
        switch(this.music.getStatus()){
            case BasicPlayer.PLAYING:
                this.music.pause();
                break;
        }
    }

    void stop() throws BasicPlayerException {
        this.loop = false;
        switch(this.music.getStatus()){
            case BasicPlayer.PLAYING:
            case BasicPlayer.PAUSED:
                this.music.stop();
                break;
        }
    }

    private BasicPlayer loadFile(final String filename) {
        BasicPlayer bp = null;
        String fName = "/sounds/" + filename;
        try {
            InputStream is = Utils.class.getResourceAsStream(fName);
            AudioInputStream in = AudioSystem.getAudioInputStream(is);
            bp = new BasicPlayer();
            bp.open(in);
        } catch (UnsupportedAudioFileException | IOException | BasicPlayerException e) {
            e.printStackTrace();
        }
        return bp;
    }

    private void initMusic(){
        this.music = this.loadFile(this.filename);
        this.music.addBasicPlayerListener(this);
    }

    @Override
    public void opened(Object o, Map map) {

    }

    @Override
    public void progress(int i, long l, byte[] bytes, Map map) {

    }

    @Override
    public void stateUpdated(final BasicPlayerEvent basicPlayerEvent) {
        if(basicPlayerEvent.getCode() == BasicPlayerEvent.STOPPED){
            if(this.loop) {
                try {
                    this.play(true);
                } catch (BasicPlayerException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void setController(BasicController basicController) {

    }
}
