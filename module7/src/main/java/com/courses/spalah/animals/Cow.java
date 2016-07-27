package com.courses.spalah.animals;

/**
 * Корова наследует абстрактный класс животное и реализует его абстрактный метод
 * doSound()
 */
public class Cow extends Animal {
    @Override
    public void doSound() {
        System.out.println("MOO");
    }
}
