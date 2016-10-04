package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class CargoCar extends Car {
    private float carrying;
    private float countOfPassengers;

    public CargoCar(float height, float width, float lenth, float weight, Engine engine, String salon, boolean roof) {
        super(height, width, lenth, weight, engine, salon, roof);
    }

    public CargoCar(Engine engine, String salon, boolean roof) {
        super(engine, salon, roof);
    }

    public CargoCar(Engine engine) {
        super(engine);
    }

    public boolean hasTrailer() {
        return true;
    }

    public float getCarrying() {
        return carrying;
    }

    public float getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCarrying(float carrying) {
        this.carrying = carrying;
    }

    public void setCountOfPassengers(float countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }
}
