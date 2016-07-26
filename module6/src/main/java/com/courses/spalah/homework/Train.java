package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class Train extends RailwayTransport {
    private int countOfCarriage;
    private int railSize;


    public Train(float height, float width, float lenth, float weight, Engine engine) {
        super(height, width, lenth, weight, engine);
    }

    public Train(Engine engine) {
        super(engine);
    }

    public int getCountOfCarriage() {
        return countOfCarriage;
    }

    public int getRailSize() {
        return railSize;
    }

    public void setCountOfCarriage(int countOfCarriage) {
        this.countOfCarriage = countOfCarriage;
    }

    public void setRailSize(int railSize) {
        this.railSize = railSize;
    }
}
