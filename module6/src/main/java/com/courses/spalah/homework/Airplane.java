package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class Airplane extends AirTransport {
    private float wingLength;
    private String chassis;
    private int takeOffLength;

    public Airplane(float height, float width, float lenth, float weight, Engine engine) {
        super(height, width, lenth, weight, engine);
    }

    public Airplane(Engine engine) {
        super(engine);
    }

    public int getTakeOffLength() {
        return takeOffLength;
    }

    public String getChassis() {
        return chassis;
    }

    public float getWingLength() {
        return wingLength;
    }

    public void setWingLength(float wingLength) {
        this.wingLength = wingLength;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setTakeOffLength(int takeOffLength) {
        this.takeOffLength = takeOffLength;
    }
}
