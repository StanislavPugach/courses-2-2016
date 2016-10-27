package com.courses.spalah.one;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ievgen Tararaka
 */
public class OneThreadBallContainer extends JPanel {
    private static final Color BACKGROUND_COLOR = Color.BLUE;

    private List<Ball> balls = new ArrayList<>();

    public OneThreadBallContainer() {
        this.setBackground(BACKGROUND_COLOR);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Ball ball = new Ball();
                balls.add(ball.init(e.getPoint()));
                System.out.println("click");
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Ball ball : balls) {
            Point position = ball.getPosition();
            int radius = ball.getRadius();

            g.fillOval(position.x, position.y, radius, radius);
            g.setColor(ball.getColor());
            moveBall(ball);
        }
    }

    public void runRepaint() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }
    }

    public void moveBall(Ball ball) {
        Point position = ball.getPosition();
        int radius = ball.getRadius();
        position.x += ball.getVx();
        position.y += ball.getVy();
        Dimension panelSize = getSize();
        if ((position.x + radius) >= panelSize.width) {
            position.x = panelSize.width - radius;
            ball.changeDirection(Ball.Direction.X);
        }
        if (position.x < 0) {
            position.x = 0;
            ball.changeDirection(Ball.Direction.X);
        }
        if ((position.y + radius) >= panelSize.height) {
            position.y = panelSize.height - radius;
            ball.changeDirection(Ball.Direction.Y);
        }
        if (position.y < 0) {
            position.y = 0;
            ball.changeDirection(Ball.Direction.Y);
        }
        ball.setPosition(position);
    }
}
