package com.courses.spalah.inheritance;

/**
 * @author Ievgen Tararaka
 */
public class Gibbon extends Ape {
    public final boolean hasLongTail = true;

    private String name;

    public Gibbon(String name) {
        this.name = name;
//        becomeHuman(); // метод не доступен так как он private
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
