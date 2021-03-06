package com.courses.spalah;

import java.io.File;

/**
 * @author Ievgen Tararaka
 */
public class PairExample {
    public static void main(String[] args) {
        Pair<File> pairOfFiles = new Pair<File>(new File("1.txt"), new File("2.txt"));
        File file = pairOfFiles.getLeft();

        Pair<String> pairOfStrings = new Pair<String >("String 1", "String 2");
        String string = pairOfStrings.getRight();

        Pair<Object> pairOfObjects = new Pair<Object>(new Object(), new Object());
        Object object = pairOfObjects.getLeft();
    }
}
