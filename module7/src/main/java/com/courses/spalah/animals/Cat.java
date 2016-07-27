package com.courses.spalah.animals;

/**
 * Кошка реализует интерфейсы CanDoSound, CanMove
 * путем переопределения методов doSound() и move()
 */
public class Cat implements CanDoSound, CanMove {
    @Override
    public void doSound() {
        System.out.println("MЯУ");
    }

    @Override
    public void move() {
        System.out.println("ИДУ");
    }
}
