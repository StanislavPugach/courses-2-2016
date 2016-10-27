package com.courses.spalah.one;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ievgen Tararaka
 */
public class OneThreadBouncyBalls extends JFrame {
    private static final Dimension WINDOW_SIZE = new Dimension(800, 600);

    private OneThreadBallContainer ballContainer;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                OneThreadBouncyBalls mainFrame = new OneThreadBouncyBalls();
                mainFrame.init();
            }
        });
    }

    public void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(WINDOW_SIZE);
        this.setVisible(true);

        ballContainer = new OneThreadBallContainer();
        this.setContentPane(ballContainer);

        ballContainer.runRepaint();
    }
}
