package com.pencelab.tetrismaster;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.ui.game.GameJFrame;
import com.pencelab.tetrismaster.ui.menu.MenuJFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    private Main(){
    }

    public static void main(String[] args){
        openMenu();
    }

    public static void openMenu(){
        JFrame jFrame = new MenuJFrame();
        jFrame.setUndecorated(true);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.pack();
        jFrame.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation(dim.width / 2 - jFrame.getSize().width / 2, dim.height / 2 - jFrame.getSize().height / 2);
        jFrame.setVisible(true);
    }

    public static void openGame(Globals.Game gameType){
        JFrame jFrame = new GameJFrame(gameType);
        jFrame.setUndecorated(true);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.pack();
        jFrame.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation(dim.width / 2 - jFrame.getSize().width / 2, dim.height / 2 - jFrame.getSize().height / 2);
        jFrame.setVisible(true);
    }

}
