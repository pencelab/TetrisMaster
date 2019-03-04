package com.pencelab.tetrismaster.ui.menu;

import com.pencelab.tetrismaster.Main;
import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.ui.game.GameJFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GamesMenuPanel extends JPanel {

    private final JButton jButtonTetris;
    private final JButton jButtonBlocks;

    private BufferedImage background;
    private BufferedImage tetrisButtonImage;
    private BufferedImage blocksButtonImage;
    private BufferedImage tetrisButtonHoverImage;
    private BufferedImage blocksButtonHoverImage;
    private BufferedImage tetrisButtonPressedImage;
    private BufferedImage blocksButtonPressedImage;

    private int width, height;

    private Point initialClick;

    public GamesMenuPanel(Container container, int width, int height){

        this.width = width;
        this.height = height;

        this.setPreferredSize(new Dimension(width, height));

        this.loadImages();

        this.jButtonTetris = new JButton(new ImageIcon(this.tetrisButtonImage));
        this.jButtonBlocks = new JButton(new ImageIcon(this.blocksButtonImage));

        this.initButtons(container);
        this.setClickEventsListener(container);

        int padding = (this.height - this.tetrisButtonImage.getHeight() - this.blocksButtonImage.getHeight()) / 6;

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.insets = new Insets(padding, 0, padding, 0);
        this.setLayout(layout);

        this.add(this.jButtonTetris, gbc);
        this.add(this.jButtonBlocks, gbc);
    }

    private void loadImages(){
        try {
            this.background = ImageIO.read(this.getClass().getResource("/imgs/menu_background.png"));
            this.tetrisButtonImage = ImageIO.read(this.getClass().getResource("/imgs/tetris_button.png"));
            this.blocksButtonImage = ImageIO.read(this.getClass().getResource("/imgs/blocks_button.png"));
            this.tetrisButtonHoverImage = ImageIO.read(this.getClass().getResource("/imgs/tetris_button_hover.png"));
            this.blocksButtonHoverImage = ImageIO.read(this.getClass().getResource("/imgs/blocks_button_hover.png"));
            this.tetrisButtonPressedImage = ImageIO.read(this.getClass().getResource("/imgs/tetris_button_pressed.png"));
            this.blocksButtonPressedImage = ImageIO.read(this.getClass().getResource("/imgs/blocks_button_pressed.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initButtons(Container container){

        this.jButtonTetris.setBorder(BorderFactory.createEmptyBorder());
        this.jButtonTetris.setContentAreaFilled(false);

        this.jButtonBlocks.setBorder(BorderFactory.createEmptyBorder());
        this.jButtonBlocks.setContentAreaFilled(false);

        this.jButtonTetris.setFocusable(false);
        this.jButtonBlocks.setFocusable(false);

        this.jButtonTetris.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model = (ButtonModel) e.getSource();
                if(model.isPressed()) {
                    jButtonTetris.setIcon(new ImageIcon(tetrisButtonPressedImage));
                } else if (model.isRollover()) {
                    jButtonTetris.setIcon(new ImageIcon(tetrisButtonHoverImage));
                } else {
                    jButtonTetris.setIcon(new ImageIcon(tetrisButtonImage));
                }
            }
        });

        this.jButtonBlocks.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model = (ButtonModel) e.getSource();
                if(model.isPressed()) {
                    jButtonBlocks.setIcon(new ImageIcon(blocksButtonPressedImage));
                } else if (model.isRollover()) {
                    jButtonBlocks.setIcon(new ImageIcon(blocksButtonHoverImage));
                } else {
                    jButtonBlocks.setIcon(new ImageIcon(blocksButtonImage));
                }
            }
        });

        this.jButtonTetris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.openGame(Globals.Game.TETRIS);
                ((JFrame) container).dispose();
            }
        });

        this.jButtonBlocks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.openGame(Globals.Game.BLOCKS);
                ((JFrame) container).dispose();
            }
        });
    }

    private void setClickEventsListener(final Container container){
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {

                // get location of Window
                int thisX = container.getLocation().x;
                int thisY = container.getLocation().y;

                // Determine how much the mouse moved since the initial click
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                // Move window to this position
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                container.setLocation(X, Y);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.background != null)
            g.drawImage(this.background, 0, 0, this.width, this.height, null);
    }

}
