package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
class BusCar extends Car {
    private int countOfPassengers;
    private boolean toilet;
    private boolean secondFlor;

    public BusCar(float height, float width, float lenth, float weight, Engine engine, String salon, boolean roof) {
        super(height, width, lenth, weight, engine, salon, roof);
    }

    public BusCar(Engine engine, String salon, boolean roof) {
        super(engine, salon, roof);
    }

    public BusCar(Engine engine) {
        super(engine);
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public boolean isToilet() {
        return toilet;
    }

    public boolean isSecondFlor() {
        return secondFlor;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public void setToilet(boolean toilet) {
        this.toilet = toilet;
    }

    public void setSecondFlor(boolean secondFlor) {
        this.secondFlor = secondFlor;
    }
}
