package com.courses.spalah.inheritance;

/**
 * @author Ievgen Tararaka
 */
public class Dog extends Animal {
    public final boolean isPet = true;

    public void gau() {
        super.doSound();
        doSound(); // аналогично предыдущей строке
        System.out.println("ГАВ!!!");
    }
}
