package com.courses.spalah.pizza;

/**
 * Пицца - это абстрактный класс, с абстрактным методом приготовления.
 * Пицца реализует некоторые методы интерфейса CheeseDish
 */
public abstract class Pizza implements CheeseDish {
    private int size;
    private int price;

    public void cook() {
        prepareBase();
        putIngridients();
        putCheese();
        fry();
    }

    public void prepareBase() {
        System.out.println("ТЕСТО");
    }

    public abstract void putIngridients();

    public void putCheese() {
        System.out.println("СЫР");
    }

    public void fry() {
        System.out.println("ВЫПЕКАНИЕ");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
