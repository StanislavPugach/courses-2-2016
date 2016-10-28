package homework;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Stanislav Pugach on 28.10.2016.
 */
class CircleFarmPanel extends JPanel {
    private CircleFarmListener farmListener;

    public CircleFarmPanel() {
        farmListener = new CircleFarmListener(this);
        this.addMouseListener(farmListener);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Circle circle : farmListener.getCircles()) {
            Point position = circle.getPosition();
            int radius = circle.getRadius();

            g.fillOval(position.x, position.y, radius, radius);
            g.setColor(circle.getColor());
            moveCircles();
        }
    }

    public void moveCircles() {
        Thread moveCircles = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    for (Circle circle : farmListener.getCircles()) {
                        moveCircle(circle);
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        moveCircles.start();
    }

    public void runRepaint() {
        Thread repaint = new Thread(new Runnable() {
            @Override
            public void run() {
                repaint();
            }
        });
        repaint.start();
    }

    private void moveCircle(Circle circle) {
        Point position = circle.getPosition();
        int radius = circle.getRadius();
        position.x += circle.getVx();
        position.y += circle.getVy();
        Dimension panelSize = getSize();
        if ((position.x + radius) >= panelSize.width) {
            position.x = panelSize.width - radius;
            circle.changeDirection(Circle.Direction.X);
        }
        if (position.x < 0) {
            position.x = 0;
            circle.changeDirection(Circle.Direction.X);
        }
        if ((position.y + radius) >= panelSize.height) {
            position.y = panelSize.height - radius;
            circle.changeDirection(Circle.Direction.Y);
        }
        if (position.y < 0) {
            position.y = 0;
            circle.changeDirection(Circle.Direction.Y);
        }
        circle.setPosition(position);
    }
}
