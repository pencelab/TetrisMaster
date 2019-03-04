package com.pencelab.tetrismaster.ui.game;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.common.Utils;
import com.pencelab.tetrismaster.controller.IGameController;
import com.pencelab.tetrismaster.game.Settings;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

class ButtonsPanel extends JPanel {

    private static final int MARGIN = 4;

    private final IGameController gameController;

    private final JCheckBox jCheckBoxMusic;
    private final JCheckBox jCheckBoxSfx;
    private final JCheckBox jCheckBoxShadow;

    private final JButton jButtonStart;
    private final JButton jButtonRestart;
    private final JButton jButtonPause;
    private final JButton jButtonResume;
    private final JButton jButtonFinish;
    private final JButton jButtonClose;

    private BufferedImage closeButtonImage;
    private BufferedImage closeButtonHoverImage;
    private BufferedImage closeButtonPressedImage;
    private BufferedImage finishButtonImage;
    private BufferedImage finishButtonHoverImage;
    private BufferedImage finishButtonPressedImage;
    private BufferedImage resumeButtonImage;
    private BufferedImage resumeButtonHoverImage;
    private BufferedImage resumeButtonPressedImage;
    private BufferedImage pauseButtonImage;
    private BufferedImage pauseButtonHoverImage;
    private BufferedImage pauseButtonPressedImage;
    private BufferedImage restartButtonImage;
    private BufferedImage restartButtonHoverImage;
    private BufferedImage restartButtonPressedImage;
    private BufferedImage startButtonImage;
    private BufferedImage startButtonHoverImage;
    private BufferedImage startButtonPressedImage;

    ButtonsPanel(final IGameController gameController, final Color parentColor, Globals.Game gameType){
        this.gameController = gameController;

        Font font = Utils.getFont(GameJFrame.FONT_NAME).deriveFont(GameJFrame.SMALL_FONT_SIZE);

        GridBagLayout layout = new GridBagLayout();

        GridBagConstraints gbcCheckbox = new GridBagConstraints();
        gbcCheckbox.weightx = 1;
        gbcCheckbox.fill = GridBagConstraints.HORIZONTAL;
        gbcCheckbox.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.weightx = 1;
        gbcButton.gridwidth = GridBagConstraints.REMAINDER;
        gbcButton.insets = new Insets(MARGIN, 0, MARGIN, 0);

        this.setLayout(layout);

        this.jCheckBoxMusic = new JCheckBox("Music");
        this.jCheckBoxSfx = new JCheckBox("Sound Effects");
        this.jCheckBoxShadow = new JCheckBox("Shadow");

        this.initCheckBoxes(font, parentColor);

        this.loadImages(gameType);

        this.jButtonStart = new JButton(new ImageIcon(this.startButtonImage));
        this.jButtonRestart = new JButton(new ImageIcon(this.restartButtonImage));
        this.jButtonPause = new JButton(new ImageIcon(this.pauseButtonImage));
        this.jButtonResume = new JButton(new ImageIcon(this.resumeButtonImage));
        this.jButtonFinish = new JButton(new ImageIcon(this.finishButtonImage));
        this.jButtonClose = new JButton(new ImageIcon(this.closeButtonImage));

        this.initButtons();

        this.add(this.jCheckBoxMusic, gbcCheckbox);
        this.add(this.jCheckBoxSfx, gbcCheckbox);
        this.add(this.jCheckBoxShadow, gbcCheckbox);
        this.add(this.jButtonStart, gbcButton);
        this.add(this.jButtonRestart, gbcButton);
        this.add(this.jButtonPause, gbcButton);
        this.add(this.jButtonResume, gbcButton);
        this.add(this.jButtonFinish, gbcButton);
        this.add(this.jButtonClose, gbcButton);

        this.setStartState();

        this.setBackground(parentColor);
    }

    private void loadImages(Globals.Game gameType){
        
        String color = "";

        switch(gameType){
            case TETRIS:
                color = "blue";
                break;
            case BLOCKS:
                color = "green";
                break;
        }
        
        try {
            this.closeButtonImage = ImageIO.read(this.getClass().getResource("/imgs/button_close_" + color + ".png"));
            this.closeButtonHoverImage = ImageIO.read(this.getClass().getResource("/imgs/button_close_" + color + "_hover.png"));
            this.closeButtonPressedImage = ImageIO.read(this.getClass().getResource("/imgs/button_close_" + color + "_pressed.png"));
            this.finishButtonImage = ImageIO.read(this.getClass().getResource("/imgs/button_finish_" + color + ".png"));
            this.finishButtonHoverImage = ImageIO.read(this.getClass().getResource("/imgs/button_finish_" + color + "_hover.png"));
            this.finishButtonPressedImage = ImageIO.read(this.getClass().getResource("/imgs/button_finish_" + color + "_pressed.png"));
            this.resumeButtonImage = ImageIO.read(this.getClass().getResource("/imgs/button_resume_" + color + ".png"));
            this.resumeButtonHoverImage = ImageIO.read(this.getClass().getResource("/imgs/button_resume_" + color + "_hover.png"));
            this.resumeButtonPressedImage = ImageIO.read(this.getClass().getResource("/imgs/button_resume_" + color + "_pressed.png"));
            this.pauseButtonImage = ImageIO.read(this.getClass().getResource("/imgs/button_pause_" + color + ".png"));
            this.pauseButtonHoverImage = ImageIO.read(this.getClass().getResource("/imgs/button_pause_" + color + "_hover.png"));
            this.pauseButtonPressedImage = ImageIO.read(this.getClass().getResource("/imgs/button_pause_" + color + "_pressed.png"));
            this.restartButtonImage = ImageIO.read(this.getClass().getResource("/imgs/button_restart_" + color + ".png"));
            this.restartButtonHoverImage = ImageIO.read(this.getClass().getResource("/imgs/button_restart_" + color + "_hover.png"));
            this.restartButtonPressedImage = ImageIO.read(this.getClass().getResource("/imgs/button_restart_" + color + "_pressed.png"));
            this.startButtonImage = ImageIO.read(this.getClass().getResource("/imgs/button_start_" + color + ".png"));
            this.startButtonHoverImage = ImageIO.read(this.getClass().getResource("/imgs/button_start_" + color + "_hover.png"));
            this.startButtonPressedImage = ImageIO.read(this.getClass().getResource("/imgs/button_start_" + color + "_pressed.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initButtons(){
        this.jButtonStart.setFocusable(false);
        this.jButtonStart.setBorder(BorderFactory.createEmptyBorder());
        this.jButtonStart.setContentAreaFilled(false);

        this.jButtonRestart.setFocusable(false);
        this.jButtonRestart.setBorder(BorderFactory.createEmptyBorder());
        this.jButtonRestart.setContentAreaFilled(false);

        this.jButtonPause.setFocusable(false);
        this.jButtonPause.setBorder(BorderFactory.createEmptyBorder());
        this.jButtonPause.setContentAreaFilled(false);

        this.jButtonResume.setFocusable(false);
        this.jButtonResume.setBorder(BorderFactory.createEmptyBorder());
        this.jButtonResume.setContentAreaFilled(false);

        this.jButtonFinish.setFocusable(false);
        this.jButtonFinish.setBorder(BorderFactory.createEmptyBorder());
        this.jButtonFinish.setContentAreaFilled(false);

        this.jButtonClose.setFocusable(false);
        this.jButtonClose.setBorder(BorderFactory.createEmptyBorder());
        this.jButtonClose.setContentAreaFilled(false);

        this.jButtonStart.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model = (ButtonModel) e.getSource();
                if(model.isPressed()) {
                    jButtonStart.setIcon(new ImageIcon(startButtonPressedImage));
                } else if (model.isRollover()) {
                    jButtonStart.setIcon(new ImageIcon(startButtonHoverImage));
                } else {
                    jButtonStart.setIcon(new ImageIcon(startButtonImage));
                }
            }
        });

        this.jButtonRestart.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model = (ButtonModel) e.getSource();
                if(model.isPressed()) {
                    jButtonRestart.setIcon(new ImageIcon(restartButtonPressedImage));
                } else if (model.isRollover()) {
                    jButtonRestart.setIcon(new ImageIcon(restartButtonHoverImage));
                } else {
                    jButtonRestart.setIcon(new ImageIcon(restartButtonImage));
                }
            }
        });

        this.jButtonPause.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model = (ButtonModel) e.getSource();
                if(model.isPressed()) {
                    jButtonPause.setIcon(new ImageIcon(pauseButtonPressedImage));
                } else if (model.isRollover()) {
                    jButtonPause.setIcon(new ImageIcon(pauseButtonHoverImage));
                } else {
                    jButtonPause.setIcon(new ImageIcon(pauseButtonImage));
                }
            }
        });

        this.jButtonResume.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model = (ButtonModel) e.getSource();
                if(model.isPressed()) {
                    jButtonResume.setIcon(new ImageIcon(resumeButtonPressedImage));
                } else if (model.isRollover()) {
                    jButtonResume.setIcon(new ImageIcon(resumeButtonHoverImage));
                } else {
                    jButtonResume.setIcon(new ImageIcon(resumeButtonImage));
                }
            }
        });

        this.jButtonFinish.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model = (ButtonModel) e.getSource();
                if(model.isPressed()) {
                    jButtonFinish.setIcon(new ImageIcon(finishButtonPressedImage));
                } else if (model.isRollover()) {
                    jButtonFinish.setIcon(new ImageIcon(finishButtonHoverImage));
                } else {
                    jButtonFinish.setIcon(new ImageIcon(finishButtonImage));
                }
            }
        });

        this.jButtonClose.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model = (ButtonModel) e.getSource();
                if(model.isPressed()) {
                    jButtonClose.setIcon(new ImageIcon(closeButtonPressedImage));
                } else if (model.isRollover()) {
                    jButtonClose.setIcon(new ImageIcon(closeButtonHoverImage));
                } else {
                    jButtonClose.setIcon(new ImageIcon(closeButtonImage));
                }
            }
        });

        this.jButtonStart.addActionListener(e -> this.gameController.startCountdown(() -> {
            this.gameController.start();
            return null;
        }));
        this.jButtonRestart.addActionListener(e -> this.gameController.restart());
        this.jButtonPause.addActionListener(e -> this.gameController.pause());
        this.jButtonResume.addActionListener(e -> this.gameController.startCountdown(() -> {
            this.gameController.resume();
            return null;
        }));
        this.jButtonFinish.addActionListener(e -> this.gameController.finish());
        this.jButtonClose.addActionListener(e -> this.gameController.close());
    }

    private void initCheckBoxes(final Font font, final Color parentColor) {
        this.jCheckBoxMusic.setFont(font);
        this.jCheckBoxSfx.setFont(font);
        this.jCheckBoxShadow.setFont(font);

        this.jCheckBoxMusic.setBackground(parentColor);
        this.jCheckBoxSfx.setBackground(parentColor);
        this.jCheckBoxShadow.setBackground(parentColor);

        this.jCheckBoxMusic.setForeground(GameJFrame.FONT_COLOR);
        this.jCheckBoxSfx.setForeground(GameJFrame.FONT_COLOR);
        this.jCheckBoxShadow.setForeground(GameJFrame.FONT_COLOR);

        this.jCheckBoxMusic.setFocusable(false);
        this.jCheckBoxSfx.setFocusable(false);
        this.jCheckBoxShadow.setFocusable(false);

        this.jCheckBoxMusic.setSelected(Settings.getInstance().isMusicEnabled());
        this.jCheckBoxMusic.addItemListener(e -> {
            switch(e.getStateChange()){
                case ItemEvent.SELECTED:
                    this.gameController.enableMusic();
                    break;
                case ItemEvent.DESELECTED:
                    this.gameController.disableMusic();
                    break;
            }
        });

        this.jCheckBoxSfx.setSelected(Settings.getInstance().isSfxEnabled());
        this.jCheckBoxSfx.addItemListener(e -> {
            switch(e.getStateChange()){
                case ItemEvent.SELECTED:
                    this.gameController.enableSoundEffects();
                    break;
                case ItemEvent.DESELECTED:
                    this.gameController.disableSoundEffects();
                    break;
            }
        });

        this.jCheckBoxShadow.setSelected(Settings.getInstance().isShadowEnabled());
        this.jCheckBoxShadow.addItemListener(e -> {
            switch(e.getStateChange()){
                case ItemEvent.SELECTED:
                    this.gameController.enableShadow();
                    break;
                case ItemEvent.DESELECTED:
                    this.gameController.disableShadow();
                    break;
            }
        });
    }

    private void setStartState(){
        this.jButtonStart.setVisible(true);
        this.jButtonRestart.setVisible(false);
        this.jButtonPause.setVisible(false);
        this.jButtonPause.setEnabled(false);
        this.jButtonResume.setVisible(false);
        this.jButtonFinish.setVisible(true);
        this.jButtonFinish.setEnabled(true);
        this.jButtonClose.setVisible(true);
    }

    void setRunningState(){
        this.jButtonStart.setVisible(false);
        this.jButtonRestart.setVisible(false);
        this.jButtonPause.setVisible(true);
        this.jButtonPause.setEnabled(true);
        this.jButtonResume.setVisible(false);
        this.jButtonFinish.setEnabled(true);
    }

    void setPausedState(){
        this.jButtonStart.setVisible(false);
        this.jButtonRestart.setVisible(false);
        this.jButtonPause.setVisible(false);
        this.jButtonPause.setEnabled(false);
        this.jButtonResume.setVisible(true);
        this.jButtonFinish.setEnabled(true);
    }

    void setGameOverState(){
        this.jButtonStart.setVisible(false);
        this.jButtonRestart.setVisible(true);
        this.jButtonPause.setVisible(false);
        this.jButtonPause.setEnabled(false);
        this.jButtonResume.setVisible(false);
        this.jButtonFinish.setEnabled(false);
    }

    void setCountingDownState() {
        this.jButtonStart.setVisible(false);
        this.jButtonRestart.setVisible(false);
        this.jButtonPause.setVisible(true);
        this.jButtonPause.setEnabled(false);
        this.jButtonResume.setVisible(false);
        this.jButtonFinish.setEnabled(true);
    }
}
