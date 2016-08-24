package com.courses.spalah;

import java.util.ArrayList;

/**
 * @author Ievgen Tararaka
 */
public class ClassicListExample {
    public static void main(String[] args) {
    }

    public static void cast() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Some string");
        String element = (String) arrayList.get(0);
    }

    public static void putAnything() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add(new Object());
        arrayList.add(555.00);

        arrayList.get(1);
    }
}
