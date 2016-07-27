package com.courses.spalah.pizza;

/**
 * Интерфейс описывающий поведение сырного блюда
 */
public interface CheeseDish {
    public void prepareBase();

    public abstract void putIngridients();

    public void putCheese();

    public void fry();

    public void cook();
}
