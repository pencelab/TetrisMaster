package com.pencelab.tetrismaster.ui.game;

import com.pencelab.tetrismaster.Main;
import com.pencelab.tetrismaster.audio.BlocksSoundManager;
import com.pencelab.tetrismaster.audio.ISoundManager;
import com.pencelab.tetrismaster.audio.TetrisSoundManager;
import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.controller.GameController;
import com.pencelab.tetrismaster.controller.IGameController;
import com.pencelab.tetrismaster.game.GameFactory;
import com.pencelab.tetrismaster.game.IGame;
import com.pencelab.tetrismaster.game.Settings;
import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.stage.IBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameJFrame extends JFrame implements IGameController.Listener, Settings.GraphicsListener{

    private static final Color BACKGROUND_STAGE_COLOR = Color.BLACK;

    static final int TITLE_BAR_HEIGHT = 60;
    static final float SQUARE_UNIT_STROKE_WIDTH = 2f;
    static final Color SQUARE_UNIT_STROKE_COLOR = Color.WHITE;
    static final float SQUARE_UNIT_SHADOW_ALPHA = 0.1f;
    static final int SQUARE_UNIT_LENGTH_IN_PIXELS = 40;
    static final int NEXT_PIECE_SQUARE_PADDING = 10;
    static final int NEXT_PIECE_SQUARE_BORDER_THICKNESS = 10;

    static final float FONT_SIZE = 24f;
    static final float SMALL_FONT_SIZE = 14f;
    static final Color FONT_COLOR = Color.WHITE;
    static final String FONT_NAME = "luckiestguy.ttf";

    static final int SHADOW_DISPLACEMENT_VERTICAL = -10;
    static final int SHADOW_DISPLACEMENT_HORIZONTAL = 10;
    static final float SHADOW_ALPHA = 0.25f;

    private GamePanel jPanelGame;
    private IGameController gameController;

    private KeyListener keyListener;

    private final Globals.Game gameType;

    public GameJFrame(Globals.Game gameType){
        this.gameType = gameType;
        initGame();
    }

    private void initGame(){
        switch(this.gameType){
            case TETRIS:
                this.initTetrisGame();
                break;
            case BLOCKS:
                this.initBlocksGame();
                break;
        }
    }

    private void initTetrisGame(){

        Settings.getInstance().removeAllListeners();

        IGame game = GameFactory.createNewTetrisGame();
        ISoundManager soundManager = TetrisSoundManager.getInstance();
        Settings.getInstance().addListener(soundManager);
        Settings.getInstance().addListener(this);
        this.gameController = new GameController(game, soundManager);
        this.gameController.addListener(this);
        this.jPanelGame = new GamePanel(this, game.getBoard(), this.gameController, BACKGROUND_STAGE_COLOR, this.gameType);

        this.setContentPane(this.jPanelGame);

        if(this.keyListener != null)
            this.removeKeyListener(this.keyListener);

        this.keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        gameController.rotate();
                        break;
                    case KeyEvent.VK_LEFT:
                        gameController.moveLeft();
                        break;
                    case KeyEvent.VK_RIGHT:
                        gameController.moveRight();
                        break;
                    case KeyEvent.VK_DOWN:
                        gameController.moveDown();
                        break;
                    case KeyEvent.VK_SPACE:
                        gameController.drop();
                        break;
                    case KeyEvent.VK_ESCAPE:
                        gameController.finish();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        this.addKeyListener(this.keyListener);
    }

    private void initBlocksGame(){

        Settings.getInstance().removeAllListeners();

        IGame game = GameFactory.createNewBlocksGame();
        ISoundManager soundManager = BlocksSoundManager.getInstance();
        Settings.getInstance().addListener(soundManager);
        Settings.getInstance().addListener(this);
        this.gameController = new GameController(game, soundManager);
        this.gameController.addListener(this);
        this.jPanelGame = new GamePanel(this, game.getBoard(), this.gameController, BACKGROUND_STAGE_COLOR, this.gameType);

        this.setContentPane(this.jPanelGame);

        if(this.keyListener != null)
            this.removeKeyListener(this.keyListener);

        this.keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        gameController.rotate();
                        break;
                    case KeyEvent.VK_LEFT:
                        gameController.moveLeft();
                        break;
                    case KeyEvent.VK_RIGHT:
                        gameController.moveRight();
                        break;
                    case KeyEvent.VK_DOWN:
                        gameController.moveDown();
                        break;
                    case KeyEvent.VK_SPACE:
                        gameController.drop();
                        break;
                    case KeyEvent.VK_ESCAPE:
                        gameController.finish();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        this.addKeyListener(this.keyListener);
    }

    @Override
    public void updateStats(int...args) {
        this.jPanelGame.updateStats(args);
    }

    @Override
    public void updateStage(IBoard board) {
        this.jPanelGame.updateStage(board);
    }

    @Override
    public void updateNextPiece(IPiece piece) {
        this.jPanelGame.updateNextPiece(piece);
    }

    @Override
    public void resumed() {
        this.jPanelGame.resume();
    }

    @Override
    public void paused() {
        this.jPanelGame.pause();
    }

    @Override
    public void gameOver() {
        this.jPanelGame.gameOver();
    }

    @Override
    public void restart() {
        this.initGame();
        SwingUtilities.updateComponentTreeUI(this);
        this.gameController.startCountdown(() -> {
            this.gameController.start();
            return null;
        });
    }

    @Override
    public void closed() {
        Settings.getInstance().removeAllListeners();
        this.dispose();
    }

    @Override
    public void countdownTic(int number) {
        this.jPanelGame.countdownTic(number);
    }

    @Override
    public void shadowEnabled() {
        this.jPanelGame.refreshStage();
    }

    @Override
    public void shadowDisabled() {
        this.jPanelGame.refreshStage();
    }

    @Override
    public void dispose() {
        super.dispose();
        this.jPanelGame.dispose();
        Main.openMenu();
    }
}
