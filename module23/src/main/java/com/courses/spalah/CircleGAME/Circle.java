package com.courses.spalah.CircleGAME;

import java.awt.*;
import java.util.Random;

/**
 * Created by Stanislav Pugach on 28.10.2016.
 */
public class Circle {
    private static final int MIN_RADIUS = 50;
    private static final int MAX_RADIUS = 60;
    private static final int MAX_VELOCITY = 3;
    private static final int MIN_VELOCITY = 1;
    private static final int COUNT_OF_COLORS = 3;

    private Point position;
    private int radius;
    private int vx, vy;
    private Color color;

    public Circle init(Point position) {
        this.position = position;

        Random random = new Random();

        this.radius = random.nextInt(MAX_RADIUS - MIN_RADIUS) + MIN_RADIUS;

        this.position.x = position.x - radius / 2;
        this.position.y = position.y - radius / 2;

        this.vx = random.nextInt(2 * MAX_VELOCITY) - MAX_VELOCITY;
        if (this.vx < MIN_VELOCITY && this.vx >= 0) {
            this.vx = MIN_VELOCITY;
        }
        if (this.vx > MIN_VELOCITY && this.vx < 0) {
            this.vx = -MIN_VELOCITY;
        }

        this.vy = random.nextInt(2 * MAX_VELOCITY) - MAX_VELOCITY;
        if (this.vy < MIN_VELOCITY && this.vy >= 0) {
            this.vy = MIN_VELOCITY;
        }
        if (this.vy > MIN_VELOCITY && this.vy < 0) {
            this.vy = -MIN_VELOCITY;
        }

        int colors = random.nextInt(COUNT_OF_COLORS);
        switch (colors){
            case 0:
                color = Color.ORANGE;
                break;
            case 1:
                color = Color.BLUE;
                break;
            case 2:
                color = Color.BLACK;
                break;
            case 3:
                color = Color.RED;
                break;
        }

        return this;
    }

    public void changeDirection(Direction direction) {
        if (direction == Direction.X) vx = vx * (-1);
        if (direction == Direction.Y) vy = vy * (-1);
    }


    public enum Direction {
        X, Y
    }

    public Point getPosition() {
        return position;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
