package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class Tram extends RailwayTransport {
    private int railSize;
    private int countOfPassengers;

    public Tram(float height, float width, float lenth, float weight, Engine engine) {
        super(height, width, lenth, weight, engine);
    }

    public Tram(Engine engine) {
        super(engine);
    }

    public int getRailSize() {
        return railSize;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setRailSize(int railSize) {
        this.railSize = railSize;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }
}
