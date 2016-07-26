package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
 class Engine {
    private String tipeOfEngine;
    private float power;
    private float torque;
    private float angularVelocity;

    public Engine(String tipeOfEngine) {
        this.tipeOfEngine = tipeOfEngine;
    }

    public Engine(String tipeOfEngine, float power, float torque) {
        this.tipeOfEngine = tipeOfEngine;
        this.power = power;
        this.torque = torque;
    }

    public float calculateFuelEconomy() {
        return 1;
    }

    public float maxPower() {
        return 1;
    }

    public float maxTorque() {
        return 1;
    }
}
