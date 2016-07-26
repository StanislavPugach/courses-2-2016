package com.courses.spalah.homework;

/**
 * Created by Пугач Станислав on 26.07.2016.
 */
class Car extends AutomobileTransport {
    private String salon;
    private boolean roof;

    public Car(float height, float width, float lenth, float weight, Engine engine, String salon, boolean roof) {
        super(height, width, lenth, weight, engine);
        this.salon = salon;
        this.roof = roof;
    }

    public Car(Engine engine, String salon, boolean roof) {
        super(engine);
        this.salon = salon;
        this.roof = roof;
    }

    public Car(Engine engine) {
        super(engine);
    }


}
