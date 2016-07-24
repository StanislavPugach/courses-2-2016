package com.courses.spalah.inheritance;

/**
 * @author Ievgen Tararaka
 */
public class Animal {
    public boolean canMove = true;

    private String sound = "";

    public Animal() {
    }

    public Animal(String sound) {
        this.sound = sound;
    }

    public void doSound() {
        System.out.println("OOO!!!");
    }
}
