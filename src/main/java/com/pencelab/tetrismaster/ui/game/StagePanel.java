package com.pencelab.tetrismaster.ui.game;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.game.Settings;
import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.stage.IBoard;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class StagePanel extends JPanel {

    private enum DisplayableText {
        PRESS_START,
        PAUSED,
        GAME_OVER,
        COUNT_1,
        COUNT_2,
        COUNT_3,
        NONE
    }

    private IBoard board;

    private final Stroke stroke;

    private BufferedImage background;
    private BufferedImage imagePressStart;
    private BufferedImage imagePaused;
    private BufferedImage imageGameOver;
    private BufferedImage imageCount1;
    private BufferedImage imageCount2;
    private BufferedImage imageCount3;

    private final int width, height;

    private DisplayableText displayableText;

    private AlphaComposite clearAlphaColorComposite;
    private AlphaComposite shadowPieceAlphaComposite;
    private AlphaComposite pieceShadowAlphaComposite;

    private float displayableTextAlpha = 1.0f;

    StagePanel(final IBoard board, final int width, final int height, final Color color, Globals.Game gameType){
        this.board = board;
        this.width = width;
        this.height = height;
        this.stroke = new BasicStroke(GameJFrame.SQUARE_UNIT_STROKE_WIDTH);
        this.displayableText = DisplayableText.PRESS_START;

        this.clearAlphaColorComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        this.shadowPieceAlphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, GameJFrame.SQUARE_UNIT_SHADOW_ALPHA);
        this.pieceShadowAlphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, GameJFrame.SHADOW_ALPHA);

        this.initImages(gameType);

        this.setPreferredSize(new Dimension(width, height));
        this.setOpaque(true);
        this.setBackground(color);

        this.startDisplayableTextAlphaChangerThread();
    }

    private void initImages(Globals.Game gameType){
        try {
            switch(gameType){
                case TETRIS:
                    this.background = ImageIO.read(this.getClass().getResource("/imgs/stage_background_blue.png"));
                    break;
                case BLOCKS:
                    this.background = ImageIO.read(this.getClass().getResource("/imgs/stage_background_green.png"));
                    break;
            }
            this.imagePressStart = ImageIO.read(this.getClass().getResource("/imgs/press_start.png"));
            this.imagePaused = ImageIO.read(this.getClass().getResource("/imgs/paused.png"));
            this.imageGameOver = ImageIO.read(this.getClass().getResource("/imgs/game_over.png"));
            this.imageCount1 = ImageIO.read(this.getClass().getResource("/imgs/count_1.png"));
            this.imageCount2 = ImageIO.read(this.getClass().getResource("/imgs/count_2.png"));
            this.imageCount3 = ImageIO.read(this.getClass().getResource("/imgs/count_3.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.paintBackground(g);
        this.paintStageShadow(g);
        this.paintPieceShadow(g);
        this.paintStage(g);
        this.paintPiece(g);

        if(Settings.getInstance().isShadowEnabled())
            this.paintShadowPiece(g);

        switch(this.displayableText){
            case PRESS_START:
                this.drawCenteredImage(g, getVisibleRect(), this.imagePressStart);
                break;
            case PAUSED:
                this.drawCenteredImage(g, getVisibleRect(), this.imagePaused);
                break;
            case GAME_OVER:
                this.drawCenteredImage(g, getVisibleRect(), this.imageGameOver);
                break;
            case COUNT_1:
                this.drawCenteredImage(g, getVisibleRect(), this.imageCount1);
                break;
            case COUNT_2:
                this.drawCenteredImage(g, getVisibleRect(), this.imageCount2);
                break;
            case COUNT_3:
                this.drawCenteredImage(g, getVisibleRect(), this.imageCount3);
                break;
        }

        /*if(!this.message.isEmpty())
            this.drawCenteredString(g, this.message, this.getVisibleRect(), this.font);*/
    }

    private void paintPiece(final Graphics g){
        if(this.board.getPiece() != null) {
            IPiece.ISquareUnit[] squareUnits = this.board.getPiece().getSquareUnits();
            for (IPiece.ISquareUnit squareUnit : squareUnits) {
                int x = squareUnit.getX() * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                int y = (squareUnit.getY() - this.board.getHiddenRows()) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                if (y >= 0) {
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
    }

    private void paintPieceShadow(final Graphics g){
        if(this.board.getPiece() != null) {
            IPiece.ISquareUnit[] squareUnits = this.board.getPiece().getSquareUnits();
            for (IPiece.ISquareUnit squareUnit : squareUnits) {
                int x = squareUnit.getX() * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                int y = (squareUnit.getY() - this.board.getHiddenRows()) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                if (y >= 0) {
                    Graphics2D g2 = (Graphics2D) g;
                    g2.setComposite(this.pieceShadowAlphaComposite);
                    g2.setColor(Color.BLACK);
                    g2.fillRect(x + GameJFrame.SHADOW_DISPLACEMENT_HORIZONTAL, y + GameJFrame.SHADOW_DISPLACEMENT_VERTICAL, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS);
                }
            }
        }
    }

    private void paintShadowPiece(final Graphics g){
        IPiece shadowPiece = this.board.getShadowPiece();
        if(shadowPiece != null) {
            IPiece.ISquareUnit[] squareUnits = shadowPiece.getSquareUnits();
            for (IPiece.ISquareUnit squareUnit : squareUnits) {
                int x = squareUnit.getX() * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                int y = (squareUnit.getY() - this.board.getHiddenRows()) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                if (y >= 0) {
                    Graphics2D g2 = (Graphics2D) g;
                    g2.setComposite(this.shadowPieceAlphaComposite);
                    g2.setColor(squareUnit.getColor());
                    g2.fillRect(x, y, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS);
                    g2.setStroke(this.stroke);
                    g2.setColor(GameJFrame.SQUARE_UNIT_STROKE_COLOR);
                    g2.drawRect(x, y, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS);
                }
            }
        }
    }

    private void paintBackground(final Graphics g) {
        if (this.background != null)
            g.drawImage(this.background, 0, 0, this.width, this.height, null);
    }

    private void paintStage(final Graphics g){
        IPiece.ISquareUnit[][] squareUnits = this.board.getSquareUnits();
        for(int i = this.board.getHiddenRows(); i < this.board.getRows(); i++){
            for(int j = 0; j < this.board.getColumns(); j++){
                if(squareUnits[i][j] != null) {
                    int x = j * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                    int y = (i - this.board.getHiddenRows()) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
                    Color fillColor = squareUnits[i][j].getColor();
                    Graphics2D g2 = (Graphics2D) g;
                    g2.setComposite(this.clearAlphaColorComposite);
                    g2.setColor(fillColor);
                    g2.fillRect(x, y, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS);
                    g2.setStroke(this.stroke);
                    g2.setColor(GameJFrame.SQUARE_UNIT_STROKE_COLOR);
                    g2.drawRect(x, y, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS);
                }
            }
        }
    }

    private void paintStageShadow(final Graphics g){
        IPiece.ISquareUnit[][] squareUnits = this.board.getSquareUnits();
        for(int i = this.board.getHiddenRows(); i < this.board.getRows(); i++){
            for(int j = 0; j < this.board.getColumns(); j++){
                if(squareUnits[i][j] != null) {
                    int x = j * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS + GameJFrame.SHADOW_DISPLACEMENT_HORIZONTAL;
                    int y = (i - this.board.getHiddenRows()) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS + GameJFrame.SHADOW_DISPLACEMENT_VERTICAL;
                    Graphics2D g2 = (Graphics2D) g;
                    g2.setComposite(this.pieceShadowAlphaComposite);
                    g2.setColor(Color.BLACK);
                    g2.fillRect(x, y, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS, GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS);
                }
            }
        }
    }

    private void drawCenteredImage(final Graphics g, final Rectangle rect, final BufferedImage image) {
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.displayableTextAlpha);
        Graphics2D g2 = (Graphics2D) g;
        g2.setComposite(ac);
        int x = rect.x + (rect.width - image.getWidth()) / 2;
        int y = rect.y + (rect.height - image.getHeight()) / 2;
        g2.drawImage(image, x, y, image.getWidth(), image.getHeight(), null);
    }

    /*private void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
        FontMetrics metrics = g.getFontMetrics(font);
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();

        g.setColor(GamePanel.BACKGROUND_STAGE_COLOR);
        g.fillRect(x - GamePanel.TEXT_PADDING, y - metrics.getHeight() - GamePanel.TEXT_PADDING, metrics.stringWidth(text) + (GamePanel.TEXT_PADDING * 2), metrics.getHeight() + (GamePanel.TEXT_PADDING * 2));

        g.setFont(font);
        g.setColor(GamePanel.STAGE_FONT_COLOR);
        g.drawString(text, x, y);
    }*/

    void refresh() {
        this.repaint();
    }

    void showCountOne(){
        this.displayableText = DisplayableText.COUNT_1;
        this.repaint();
    }

    void showCountTwo(){
        this.displayableText = DisplayableText.COUNT_2;
        this.repaint();
    }

    void showCountThree(){
        this.displayableText = DisplayableText.COUNT_3;
        this.repaint();
    }

    void updateStage(final IBoard board){
        this.board = board;
        this.repaint();
    }

    public void resume() {
        this.displayableText = DisplayableText.NONE;
        this.repaint();
    }

    public void pause() {
        this.displayableText = DisplayableText.PAUSED;
        this.startDisplayableTextAlphaChangerThread();
        this.repaint();
    }

    public void gameOver() {
        this.displayableText = DisplayableText.GAME_OVER;
        this.repaint();
    }

    void dispose() {
        this.displayableText = DisplayableText.NONE;
    }

    private void startDisplayableTextAlphaChangerThread(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean fadingOut = true;
                int shortWaitTimeInMilliseconds = 30;
                int longWaitTimeInMilliseconds = 300;

                while(displayableText == DisplayableText.PRESS_START || displayableText == DisplayableText.PAUSED){
                    if(fadingOut) {
                        displayableTextAlpha -= 0.1f;
                        if(displayableTextAlpha < 0.0f) {
                            displayableTextAlpha = 0.0f;
                            fadingOut = false;
                        }
                    }else {
                        displayableTextAlpha += 0.1f;
                        if(displayableTextAlpha > 1.0f) {
                            displayableTextAlpha = 1.0f;
                            fadingOut = true;
                        }

                    }
                    refresh();
                    try {
                        if(displayableTextAlpha == 1.0f)
                            TimeUnit.MILLISECONDS.sleep(longWaitTimeInMilliseconds);
                        else
                            TimeUnit.MILLISECONDS.sleep(shortWaitTimeInMilliseconds);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                displayableTextAlpha = 1.0f;
                refresh();
            }
        });
        thread.start();
    }
}
