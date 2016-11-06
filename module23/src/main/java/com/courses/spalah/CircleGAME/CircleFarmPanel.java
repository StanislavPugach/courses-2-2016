package com.courses.spalah.CircleGAME;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Stanislav Pugach on 28.10.2016.
 */
class CircleFarmPanel extends JPanel {
    private volatile ArrayList<Circle> circles = new ArrayList();
    private CircleFarmListener listener = new CircleFarmListener(this);

    public CircleFarmPanel() {
        this.addMouseListener(listener);
        runRepaint();
        runCreateCircle();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Circle circle : circles) {
            Point position = circle.getPosition();
            int radius = circle.getRadius();

            g.fillOval(position.x, position.y, radius, radius);
            g.setColor(circle.getColor());
        }
    }

    private void createCircle() {
        Random random = new Random();
        Point point = new Point(random.nextInt(670), random.nextInt(500));
        newCircle(point);
    }

    private void runCreateCircle() {
        Thread create = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    createCircle();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        create.start();
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
//            multiplyCircle(circle);
        }
        if (position.x < 0) {
            position.x = 0;
            circle.changeDirection(Circle.Direction.X);
//            multiplyCircle(circle);
        }
        if ((position.y + radius) >= panelSize.height) {
            position.y = panelSize.height - radius;
            circle.changeDirection(Circle.Direction.Y);
//            multiplyCircle(circle);
        }
        if (position.y < 0) {
            position.y = 0;
            circle.changeDirection(Circle.Direction.Y);
//            multiplyCircle(circle);
        }
        circle.setPosition(position);
    }

    private void multiplyCircle(Circle circle) {
        Color color = circle.getColor();
        if (color.equals(Color.BLACK)){
            newCircle(circle.getPosition());
            //TODO change direction
        }
        if (color.equals(Color.BLUE)){
            newCircle(circle.getPosition());
        }
        if (color.equals(Color.ORANGE)){
            newCircle(circle.getPosition());
            newCircle(circle.getPosition());
        }
        if (color.equals(Color.RED)){
            newCircle(circle.getPosition());
            newCircle(circle.getPosition());
            newCircle(circle.getPosition());
        }
    }

    private void newCircle(Point point) {
        Circle circle = new Circle();
        circles.add(circle.init(point));
        Thread movingCircle = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    moveCircle(circle);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        movingCircle.start();
    }


    public ArrayList<Circle> getCircles() {
        return circles;
    }
}
