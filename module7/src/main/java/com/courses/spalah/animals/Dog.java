package com.courses.spalah.animals;

/**
 * Собака наследует абстрактный класс животное и реализует его абстрактный метод
 * doSound()
 */
public class Dog extends Animal {
    @Override
    public void doSound() {
        System.out.println("ГАВ");
    }
}
