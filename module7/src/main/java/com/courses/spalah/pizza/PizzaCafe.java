package com.courses.spalah.pizza;

/**
 * Created by Jeka on 26.07.2016.
 */
public class PizzaCafe {
    public static void main(String[] args) {
        dishes();
    }

    public static void dishes() {
        // Peperoni это Pizza с реализацией всех методов этого класса
        Pizza p1 = new Peperoni();
        p1.cook();

        // Margarita это Pizza с реализацией всех методов этого класса
        Pizza p2 = new Margarita();
        p2.cook();

        // Любая Pizza это CheeseDish
        CheeseDish dish1 = p2;
        p2.cook();

        // Lasania это также CheeseDish
        CheeseDish lasania = new Lasania();
        lasania.cook();
    }
}
