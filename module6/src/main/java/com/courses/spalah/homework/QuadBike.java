package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class QuadBike extends Motorcycles {
    private float clearance;
    private boolean fourWheelDrive;

    public QuadBike(float height, float width, float lenth, float weight, Engine engine) {
        super(height, width, lenth, weight, engine);
    }

    public QuadBike(Engine engine) {
        super(engine);
    }

    public float getClearance() {
        return clearance;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setClearance(float clearance) {
        this.clearance = clearance;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}
