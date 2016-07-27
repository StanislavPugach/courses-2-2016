package com.courses.spalah.pizza;

/**
 * Перерони наследует абстрактную пиццу и реализует метод putIngridients()
 */
public class Margarita extends Pizza {
    @Override
    public void putIngridients() {
        System.out.println("ГРИБЫ И ПОМИДОРЫ");
    }
}
