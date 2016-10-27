package com.courses.spalah.one;

import java.awt.*;
import java.util.Random;

/**
 * @author Ievgen Tararaka
 */
public class Ball {
    private static final int MIN_RADIUS = 10;
    private static final int MAX_RADIUS = 60;
    private static final int MAX_VELOCITY = 11;
    private static final int MIN_VELOCITY = 3;
    private static final int MAX_SATURATION = 255;

    private Point position;
    private int radius;
    private int vx, vy;
    private Color color;

    public Ball() {
    }

    public Ball init(Point position) {
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

        int red = random.nextInt(MAX_SATURATION);
        int green = random.nextInt(MAX_SATURATION);
        int blue = random.nextInt(MAX_SATURATION);
        color = new Color(red, green, blue);
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

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
