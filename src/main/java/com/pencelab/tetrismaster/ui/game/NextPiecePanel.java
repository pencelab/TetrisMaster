package com.pencelab.tetrismaster.ui.game;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.common.Utils;
import com.pencelab.tetrismaster.pieces.IPiece;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

class NextPiecePanel extends JPanel {

    private final NextPieceSquarePanel nextPieceSquarePanel;

    NextPiecePanel(final int length, final Color parentColor, Globals.Game gameType){
        this.nextPieceSquarePanel = new NextPieceSquarePanel(length, parentColor, gameType);

        JLabel jLabelNextPiece = new JLabel("Next");
        jLabelNextPiece.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabelNextPiece.setFont(Utils.getFont(GameJFrame.FONT_NAME).deriveFont(GameJFrame.FONT_SIZE));
        jLabelNextPiece.setForeground(GameJFrame.FONT_COLOR);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        if(parentColor != null)
            this.setBackground(parentColor);

        this.add(this.nextPieceSquarePanel);
        this.add(jLabelNextPiece);
    }

    void updateNextPiece(final IPiece piece) {
        this.nextPieceSquarePanel.refresh(piece);
    }

    private class NextPieceSquarePanel extends JPanel{

        private final int width, height;
        private final Stroke stroke;

        private IPiece piece;
        private int offsetX = 0;
        private int offsetY = 0;
        private int minX, minY;

        private BufferedImage background;

        private AlphaComposite clearAlphaColorComposite;
        private AlphaComposite pieceShadowAlphaComposite;

        NextPieceSquarePanel(final int length, final Color parentColor, Globals.Game gameType){
            this.width = length;
            this.height = length;
            this.stroke = new BasicStroke(GameJFrame.SQUARE_UNIT_STROKE_WIDTH);

            this.clearAlphaColorComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
            this.pieceShadowAlphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, GameJFrame.SHADOW_ALPHA);

            this.setPreferredSize(new Dimension(length + GameJFrame.NEXT_PIECE_SQUARE_BORDER_THICKNESS * 2, length + GameJFrame.NEXT_PIECE_SQUARE_BORDER_THICKNESS * 2));
            this.setBorder(BorderFactory.createLineBorder(parentColor, GameJFrame.NEXT_PIECE_SQUARE_BORDER_THICKNESS));
            this.setOpaque(true);
            this.setBackground(parentColor);

            try {
                switch(gameType){
                    case TETRIS:
                        this.background = ImageIO.read(this.getClass().getResource("/imgs/next_piece_background_blue.png"));
                        break;
                    case BLOCKS:
                        this.background = ImageIO.read(this.getClass().getResource("/imgs/next_piece_background_green.png"));
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        void refresh(final IPiece piece){
            this.piece = piece;
            this.calculateOffsets();
            this.repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.paintBackground(g);
            this.paintPieceShadow(g);
            this.paintPiece(g);
        }

        private void paintBackground(final Graphics g) {
            if (this.background != null)
                g.drawImage(this.background, GameJFrame.NEXT_PIECE_SQUARE_PADDING, GameJFrame.NEXT_PIECE_SQUARE_PADDING, this.width, this.height, null);
        }

        private void paintPiece(final Graphics g) {
            if(this.piece != null) {
                IPiece.ISquareUnit[] squareUnits = this.piece.getSquareUnits();
                int x, y;
                for (IPiece.ISquareUnit squareUnit : squareUnits) {
                    x = this.offsetX + (squareUnit.getX() - this.minX) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                    y = this.offsetY + (squareUnit.getY() - this.minY) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;

                    Graphics2D g2 = (Graphics2D) g;
                    g2.setComposite(this.clearAlphaColorComposite);
                    g2.setColor(squareUnit.getColor());
                    g2.fillRect(x, y, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS);
                    g2.setStroke(this.stroke);
                    g2.setColor(GameJFrame.SQUARE_UNIT_STROKE_COLOR);
                    g2.drawRect(x, y, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS);
                }
            }
        }

        private void paintPieceShadow(final Graphics g){
            if(this.piece != null) {
                IPiece.ISquareUnit[] squareUnits = this.piece.getSquareUnits();
                int x, y;
                for (IPiece.ISquareUnit squareUnit : squareUnits) {
                    x = this.offsetX + (squareUnit.getX() - this.minX) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                    y = this.offsetY + (squareUnit.getY() - this.minY) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                    Graphics2D g2 = (Graphics2D) g;
                    g2.setComposite(this.pieceShadowAlphaComposite);
                    g2.setColor(Color.BLACK);
                    g2.fillRect(x + GameJFrame.SHADOW_DISPLACEMENT_HORIZONTAL, y + GameJFrame.SHADOW_DISPLACEMENT_VERTICAL, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS);
                }
            }
        }

        private void calculateOffsets(){
            this.minX = Integer.MAX_VALUE;
            int maxX = 0;
            this.minY = Integer.MAX_VALUE;
            int maxY = 0;

            IPiece.ISquareUnit[] squareUnits = this.piece.getSquareUnits();
            for (IPiece.ISquareUnit squareUnit : squareUnits) {
                if(squareUnit.getX() < this.minX)
                    this.minX = squareUnit.getX();

                if(squareUnit.getX() > maxX)
                    maxX = squareUnit.getX();

                if(squareUnit.getY() < this.minY)
                    this.minY = squareUnit.getY();

                if(squareUnit.getY() > maxY)
                    maxY = squareUnit.getY();
            }

            int diffX = maxX - this.minX + 1;
            int diffY = maxY - this.minY + 1;

            int width = diffX * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
            int height = diffY * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;

            this.offsetX = (this.getWidth() - width) / 2;
            this.offsetY = (this.getHeight() - height) / 2;
        }
    }
}
