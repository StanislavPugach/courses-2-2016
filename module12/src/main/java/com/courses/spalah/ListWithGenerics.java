package com.courses.spalah;

import java.util.ArrayList;

/**
 * @author Ievgen Tararaka
 */
public class ListWithGenerics {
    public static void main(String[] args) {

    }

    public static void autoCast() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Some string");
        String element = arrayList.get(0);
    }

    public static void typeCheck() {
        ArrayList<String> strings = new ArrayList<String >();
        strings.add("A");
        strings.add("B");
//        strings.add(1L);
    }
}
