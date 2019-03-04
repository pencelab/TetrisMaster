package com.pencelab.tetrismaster.ui.game;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.stage.BlocksBoard;
import com.pencelab.tetrismaster.stage.TetrisBoard;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TitlePanel extends JPanel {

    private Point initialClick;

    private BufferedImage background = null;
    private final int width, height;

    TitlePanel(final Container container, final int width, final int height, final Color color, Globals.Game gameType){
        this.width = width;
        this.height = height;

        this.setPreferredSize(new Dimension(width, height));
        this.setOpaque(true);
        this.setBackground(color);

        this.initImages(gameType);
        this.setClickEventsListener(container);
    }

    private void initImages(Globals.Game gameType){
        try {
            switch(gameType){
                case TETRIS:
                    this.background = ImageIO.read(this.getClass().getResource("/imgs/tetris_title_bar.png"));
                    break;
                case BLOCKS:
                    this.background = ImageIO.read(this.getClass().getResource("/imgs/blocks_title_bar.png"));
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
