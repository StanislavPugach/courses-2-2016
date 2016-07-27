package com.courses.spalah.pizza;

/**
 * Перерони наследует абстрактную пиццу и реализует метод putIngridients()
 */
public class Peperoni extends Pizza {
    @Override
    public void putIngridients() {
        System.out.println("ПЕРЕЦ И КОЛБАСКИ");
    }
}
