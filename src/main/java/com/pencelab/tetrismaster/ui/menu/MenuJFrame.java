package com.pencelab.tetrismaster.ui.menu;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MenuJFrame extends JFrame {

    private final static int WIDTH = 480;
    private final static int HEIGHT = 776;

    private final GamesMenuPanel gamesMenuPanel;

    private final KeyListener keyListener;

    public MenuJFrame(){
        this.gamesMenuPanel = new GamesMenuPanel(this, WIDTH, HEIGHT);
        this.setContentPane(this.gamesMenuPanel);

        this.keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_ESCAPE:
                        System.exit(0);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        this.addKeyListener(this.keyListener);
    }
}
