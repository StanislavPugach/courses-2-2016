package com.courses.spalah.separate;

import com.courses.spalah.one.OneThreadBallContainer;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ievgen Tararaka
 */
public class SeparateThreadBouncyBalls extends JFrame {
    private static final Dimension WINDOW_SIZE = new Dimension(800, 600);

    private SeparateThreadBallContainer ballContainer;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SeparateThreadBouncyBalls mainFrame = new SeparateThreadBouncyBalls();
                mainFrame.init();
            }
        });
    }

    public void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(WINDOW_SIZE);
        this.setVisible(true);

        ballContainer = new SeparateThreadBallContainer();
        this.setContentPane(ballContainer);

        ballContainer.runRepaint();
    }
}
