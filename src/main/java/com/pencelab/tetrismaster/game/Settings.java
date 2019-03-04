package com.pencelab.tetrismaster.game;

import java.util.HashSet;
import java.util.Set;

public final class Settings {

    public interface AudioListener {
        void musicEnabled();
        void musicDisabled();
    }

    public interface GraphicsListener {
        void shadowEnabled();
        void shadowDisabled();
    }

    private static Settings settings;

    private boolean musicEnabled = true;
    private boolean sfxEnabled = true;
    private boolean shadowEnabled = true;

    private final Set<AudioListener> audioListeners;
    private final Set<GraphicsListener> graphicsListeners;

    private Settings(){
        this.audioListeners = new HashSet<>();
        this.graphicsListeners = new HashSet<>();
    }

    public static synchronized Settings getInstance() {
        if(settings == null)
            settings = new Settings();

        return settings;
    }

    public boolean isMusicEnabled() {
        return this.musicEnabled;
    }

    public void enableMusic() {
        this.musicEnabled = true;
        for (AudioListener listener : this.audioListeners) {
            listener.musicEnabled();
        }
    }

    public void disableMusic() {
        this.musicEnabled = false;
        for (AudioListener listener : this.audioListeners) {
            listener.musicDisabled();
        }
    }

    public boolean isSfxEnabled() {
        return this.sfxEnabled;
    }

    public void enableSfx() {
        this.sfxEnabled = true;
    }

    public void disableSfx() {
        this.sfxEnabled = false;
    }

    public boolean isShadowEnabled() {
        return this.shadowEnabled;
    }

    public void enableShadow() {
        this.shadowEnabled = true;
        for (GraphicsListener listener : this.graphicsListeners) {
            listener.shadowEnabled();
        }
    }

    public void disableShadow() {
        this.shadowEnabled = false;
        for (GraphicsListener listener : this.graphicsListeners) {
            listener.shadowDisabled();
        }
    }

    public void addListener(final AudioListener listener){
        this.audioListeners.add(listener);
    }

    public void addListener(final GraphicsListener listener){
        this.graphicsListeners.add(listener);
    }

    public void removeListener(final AudioListener listener){
        this.graphicsListeners.remove(listener);
    }

    public void removeListener(final GraphicsListener listener){
        this.graphicsListeners.remove(listener);
    }

    public void removeAllListeners(){
        this.audioListeners.clear();
        this.graphicsListeners.clear();
    }

}
