package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
class PassengerCar extends Car {
    private int countOfPassengers;
    private float trunkDisplacement;

    public PassengerCar(float height, float width, float lenth, float weight, Engine engine, String salon, boolean roof) {
        super(height, width, lenth, weight, engine, salon, roof);
    }

    public PassengerCar(Engine engine, String salon, boolean roof) {
        super(engine, salon, roof);
    }

    public PassengerCar(Engine engine) {
        super(engine);
    }


    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public void setTrunkDisplacement(float trunkDisplacement) {
        this.trunkDisplacement = trunkDisplacement;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public float getTrunkDisplacement() {
        return trunkDisplacement;
    }
}
