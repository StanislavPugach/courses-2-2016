package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class SportMotobike extends Motorbike {
    private boolean engineCowl;
    private boolean frontFairing;

    public SportMotobike(float height, float width, float lenth, float weight, Engine engine) {
        super(height, width, lenth, weight, engine);
    }

    public SportMotobike(Engine engine) {
        super(engine);
    }

    public boolean isEngineCowl() {
        return engineCowl;
    }

    public boolean isFrontFairing() {
        return frontFairing;
    }

    public void setEngineCowl(boolean engineCowl) {
        this.engineCowl = engineCowl;
    }

    public void setFrontFairing(boolean frontFairing) {
        this.frontFairing = frontFairing;
    }
}
