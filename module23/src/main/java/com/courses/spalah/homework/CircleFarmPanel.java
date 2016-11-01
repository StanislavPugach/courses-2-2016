package com.courses.spalah.homework;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Stanislav Pugach on 28.10.2016.
 */
class CircleFarmPanel extends JPanel {
    private CircleFarmListener farmListener;

    public CircleFarmPanel() {
        farmListener = new CircleFarmListener(this);
        this.addMouseListener(farmListener);
        runRepaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Circle circle : farmListener.getCircles()) {
            Point position = circle.getPosition();
            int radius = circle.getRadius();

            g.fillOval(position.x, position.y, radius, radius);
            g.setColor(circle.getColor());
        }
    }


    private void runRepaint() {
        Thread repaint = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    repaint();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        repaint.start();
    }

    public synchronized void moveCircle(Circle circle) {
        Point position = circle.getPosition();
        int radius = circle.getRadius();
        position.x += circle.getVx();
        position.y += circle.getVy();
        Dimension panelSize = getSize();
        if ((position.x + radius) >= panelSize.width) {
            position.x = panelSize.width - radius;
            circle.changeDirection(Circle.Direction.X);
            changeColor(circle);
        }
        if (position.x < 0) {
            position.x = 0;
            circle.changeDirection(Circle.Direction.X);
            changeColor(circle);
        }
        if ((position.y + radius) >= panelSize.height) {
            position.y = panelSize.height - radius;
            circle.changeDirection(Circle.Direction.Y);
            changeColor(circle);
        }
        if (position.y < 0) {
            position.y = 0;
            circle.changeDirection(Circle.Direction.Y);
            changeColor(circle);
        }
        circle.setPosition(position);
    }

    private synchronized void changeColor(Circle cir){
        if (farmListener.getCircles().size() < 3){
            return;
        }
        Random random = new Random();
        int count = 0;
        while (count != 2){
            int circle = random.nextInt(farmListener.getCircles().size() - 1);
            if (farmListener.getCircles().get(circle).equals(cir)){
                continue;
            }
            else {
                farmListener.getCircles().get(circle).changeColor();
                count++;
            }
        }
    }
}
