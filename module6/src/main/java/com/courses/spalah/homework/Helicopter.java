package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class Helicopter extends AirTransport {
    private float bladeLength;
    private String chassis;

    public Helicopter(float height, float width, float lenth, float weight, Engine engine) {
        super(height, width, lenth, weight, engine);
    }

    public Helicopter(Engine engine) {
        super(engine);
    }

    public float getBladeLength() {
        return bladeLength;
    }

    public String getChassis() {
        return chassis;
    }

    public void setBladeLength(float bladeLength) {
        this.bladeLength = bladeLength;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
}
