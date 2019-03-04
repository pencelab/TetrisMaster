package com.pencelab.tetrismaster.ui.game;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.controller.IGameController;
import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.stage.IBoard;

import javax.swing.*;
import java.awt.*;

class GamePanel extends JPanel {

    private final TitlePanel titlePanel;
    private final StagePanel stagePanel;
    private final SidePanel sidePanel;

    GamePanel(final Container container, final IBoard board, final IGameController gameController, final Color color, Globals.Game gameType) {
        int heightStage = (board.getRows() - board.getHiddenRows()) * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;
        int widthStage = board.getColumns() * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS;

        int widthStats = 4 * GameJFrame.SQUARE_UNIT_LENGTH_IN_PIXELS + 2 * GameJFrame.NEXT_PIECE_SQUARE_PADDING;

        this.titlePanel = new TitlePanel(container, widthStage + widthStats + 2 * GameJFrame.NEXT_PIECE_SQUARE_BORDER_THICKNESS, GameJFrame.TITLE_BAR_HEIGHT, color, gameType);
        this.stagePanel = new StagePanel(board, widthStage, heightStage, color, gameType);
        this.sidePanel = new SidePanel(widthStats, color, gameController, gameType);

        this.setLayout(new BorderLayout());

        this.add(this.titlePanel, BorderLayout.NORTH);
        this.add(this.stagePanel, BorderLayout.CENTER);
        this.add(this.sidePanel, BorderLayout.EAST);
    }

    void updateStats(final int...args) {
        this.sidePanel.updateStats(args);
    }

    void refreshStage(){
        this.stagePanel.refresh();
    }

    void updateStage(final IBoard board) {
        this.stagePanel.updateStage(board);
    }

    void updateNextPiece(final IPiece piece) {
        this.sidePanel.updateNextPiece(piece);
    }

    void resume() {
        this.stagePanel.resume();
        this.sidePanel.resume();
    }

    void pause() {
        this.stagePanel.pause();
        this.sidePanel.pause();
    }

    void gameOver() {
        this.stagePanel.gameOver();
        this.sidePanel.gameOver();
    }

    void countdownTic(final int number) {
        this.sidePanel.setCountingDownState();
        switch(number){
            case 1:
                this.stagePanel.showCountOne();
                break;
            case 2:
                this.stagePanel.showCountTwo();
                break;
            case 3:
                this.stagePanel.showCountThree();
                break;
        }
    }

    void dispose() {
        this.stagePanel.dispose();
    }
}
