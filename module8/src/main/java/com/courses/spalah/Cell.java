package com.courses.spalah;

/**
 * Created by Пугач Станислав on 29.07.2016.
 */
 class Cell {
    private int number;
    private int color; // 1 - red 2 - black

    public Cell(int number, int color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public int getColor() {
        return color;
    }
}
