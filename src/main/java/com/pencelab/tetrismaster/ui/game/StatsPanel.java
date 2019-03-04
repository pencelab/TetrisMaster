package com.pencelab.tetrismaster.ui.game;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.common.Utils;

import javax.swing.*;
import java.awt.*;

class StatsPanel extends JPanel {

    private final static int MARGIN = 20;

    private final JLabel[] jLabelStatsLabel;
    private final JLabel[] jLabelStatsData;

    StatsPanel(final Color parentColor, Globals.Game gameType){
        Font font = Utils.getFont(GameJFrame.FONT_NAME).deriveFont(GameJFrame.FONT_SIZE);

        String[] stats = null;

        switch(gameType){
            case TETRIS:
                stats = Globals.tetrisStats;
                break;
            case BLOCKS:
                stats = Globals.blocksStats;
                break;
        }

        int length = stats.length;

        this.jLabelStatsLabel = new JLabel[length];
        this.jLabelStatsData = new JLabel[length];

        for (int i = 0; i < length; i++) {
            this.jLabelStatsLabel[i] = new JLabel(stats[i]);
            this.jLabelStatsData[i] = new JLabel("0");
        }

        this.initJLabels(font);

        GridBagLayout layout = new GridBagLayout();

        GridBagConstraints gbcWithTopPadding = new GridBagConstraints();
        gbcWithTopPadding.weightx = 1;
        gbcWithTopPadding.fill = GridBagConstraints.HORIZONTAL;
        gbcWithTopPadding.gridwidth = GridBagConstraints.REMAINDER;
        gbcWithTopPadding.insets = new Insets(MARGIN, 0, 0, 0);

        GridBagConstraints gbcWithBottomPadding = new GridBagConstraints();
        gbcWithBottomPadding.weightx = 1;
        gbcWithBottomPadding.fill = GridBagConstraints.HORIZONTAL;
        gbcWithBottomPadding.gridwidth = GridBagConstraints.REMAINDER;
        gbcWithBottomPadding.insets = new Insets(0, 0, MARGIN, 0);

        this.setLayout(layout);
        if(parentColor != null)
            this.setBackground(parentColor);

        for (int i = 0; i < length; i++) {
            this.add(this.jLabelStatsLabel[i], gbcWithTopPadding);
            this.add(this.jLabelStatsData[i], gbcWithBottomPadding);
        }
    }

    void updateStats(final int...args) {
        int length = args.length;
        for(int i = 0; i < length; i++){
            this.jLabelStatsData[i].setText(String.valueOf(args[i]));
        }
    }

    private void initJLabels(final Font font){
        int length = this.jLabelStatsData.length;
        for(int i = 0; i < length; i++){
            this.jLabelStatsLabel[i].setFont(font);
            this.jLabelStatsData[i].setFont(font);
            this.jLabelStatsLabel[i].setForeground(GameJFrame.FONT_COLOR);
            this.jLabelStatsData[i].setForeground(GameJFrame.FONT_COLOR);
            this.jLabelStatsLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
            this.jLabelStatsData[i].setHorizontalAlignment(SwingConstants.CENTER);
        }
    }
}
