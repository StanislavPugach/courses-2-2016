package com.courses.spalah;

/**
 * Created by Пугач Станислав on 29.07.2016.
 */
 class Cell {
    private int number;
    private Colors color; // 1 - red 2 - black

    public Cell(int number, Colors color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", color=" + color;
    }
}
