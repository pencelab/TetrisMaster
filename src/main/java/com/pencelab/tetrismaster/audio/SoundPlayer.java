package com.pencelab.tetrismaster.audio;

import javax.sound.sampled.*;

import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;
import static javax.sound.sampled.AudioSystem.getAudioInputStream;

final class SoundPlayer {

    private Clip[] soundEffects;

    SoundPlayer(final String[] filenames) {
        this.loadFiles(filenames);
    }

    void play(final int index) {
        Thread thread = new Thread(() -> {
            if(this.soundEffects[index].isRunning()) {
                this.soundEffects[index].stop();
            }
            this.soundEffects[index].setFramePosition(0);
            this.soundEffects[index].start();
        });
        thread.start();
    }

    private void loadFiles(final String[] filenames) {
        int length = filenames.length;
        this.soundEffects = new Clip[length];
        for (int i = 0; i < length; i++) {
            this.soundEffects[i] = this.loadClip(filenames[i]);
        }
    }

    private Clip loadClip(final String filename) {
        Clip in = null;
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream( SoundPlayer.class.getResource("/sounds/" + filename));
            final AudioFormat outFormat = getOutFormat(audioIn.getFormat());
            AudioInputStream audioInputStream = getAudioInputStream(outFormat, audioIn);
            in = AudioSystem.getClip();
            in.open(audioInputStream);
        } catch(Exception e) {
            e.printStackTrace();
        }

        return in;
    }

    private static AudioFormat getOutFormat(final AudioFormat inFormat) {
        final int ch = inFormat.getChannels();
        final float rate = inFormat.getSampleRate();
        return new AudioFormat(PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);
    }

}
