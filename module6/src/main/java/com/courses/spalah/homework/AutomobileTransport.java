package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class AutomobileTransport extends Vehicle {
    private float height;
    private float width;
    private float lenth;
    private float weight;

    public AutomobileTransport(float height, float width, float lenth, float weight, Engine engine) {
        super(engine);
        this.height = height;
        this.width = width;
        this.lenth = lenth;
        this.weight = weight;
    }

    public AutomobileTransport(Engine engine) {
        super(engine);
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getLenth() {
        return lenth;
    }

    public float getWeight() {
        return weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setLenth(float lenth) {
        this.lenth = lenth;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
