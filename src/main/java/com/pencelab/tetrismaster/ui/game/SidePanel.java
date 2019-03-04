package com.pencelab.tetrismaster.ui.game;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.controller.IGameController;
import com.pencelab.tetrismaster.pieces.IPiece;

import javax.swing.*;
import java.awt.*;

class SidePanel extends JPanel {

    private final NextPiecePanel nextPiecePanel;
    private final StatsPanel statsPanel;
    private final ButtonsPanel buttonsPanel;

    SidePanel(final int width, final Color color, final IGameController gameController, Globals.Game gameType){
        this.nextPiecePanel = new NextPiecePanel(width, color, gameType);
        this.statsPanel = new StatsPanel(color, gameType);
        this.buttonsPanel = new ButtonsPanel(gameController, color, gameType);

        this.setLayout(new BorderLayout());
        this.setBackground(color);
        this.add(this.nextPiecePanel, BorderLayout.NORTH);
        this.add(this.statsPanel, BorderLayout.CENTER);
        this.add(this.buttonsPanel, BorderLayout.SOUTH);
    }

    void updateStats(final int...args) {
        this.statsPanel.updateStats(args);
    }

    void updateNextPiece(final IPiece piece) {
        this.nextPiecePanel.updateNextPiece(piece);
    }

    void setCountingDownState() {
        this.buttonsPanel.setCountingDownState();
    }

    public void resume() {
        this.buttonsPanel.setRunningState();
    }

    public void pause() {
        this.buttonsPanel.setPausedState();
    }

    public void gameOver() {
        this.buttonsPanel.setGameOverState();
    }
}
