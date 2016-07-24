package com.courses.spalah.inheritance;

/**
 * @author Ievgen Tararaka
 */
public class Ape extends Animal {
    public final boolean canClimbOnTrees = true;

    public Ape() {
        super(); // не явный вызов в любом конструкторе
    }

    public Ape(String sound) {
        super(sound);
    }

    private void becomeHuman() {
        System.out.println("ТЕПЕРЬ Я ЧЕЛОВЕК!!!");
    }
}
