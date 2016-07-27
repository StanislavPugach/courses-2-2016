package com.courses.spalah.pizza;

/**
 * Лазанья реализует поведение сырного блюда
 */
public class Lasania implements CheeseDish {
    @Override
    public void prepareBase() {
        System.out.println("ПАСТА");
    }

    @Override
    public void putIngridients() {
        System.out.println("ФАРШ И ТОМАТНЫЙ СОУС");
    }

    @Override
    public void putCheese() {
        System.out.println("СЫР");
    }

    @Override
    public void fry() {
        System.out.println("ВЫПЕКАНИЕ");
    }

    @Override
    public void cook() {
        prepareBase();
        putIngridients();
        prepareBase();
        putIngridients();
        putCheese();
        fry();
    }
}
