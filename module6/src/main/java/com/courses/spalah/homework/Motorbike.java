package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class Motorbike extends Motorcycles {
    private boolean carriage;

    public Motorbike(float height, float width, float lenth, float weight, Engine engine) {
        super(height, width, lenth, weight, engine);
    }

    public Motorbike(Engine engine) {
        super(engine);
    }

    public boolean isCarriage() {
        return carriage;
    }

    public void setCarriage(boolean carriage) {
        this.carriage = carriage;
    }
}
