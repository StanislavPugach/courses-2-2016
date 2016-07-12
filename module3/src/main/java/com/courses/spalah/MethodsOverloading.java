package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class MethodsOverloading {
    public void draw(int i) {
    }

    public void draw(String s) {
    }

    public void draw(long a, long b) {
    }

//    public Object draw(int i) { // не валидный метод, т.к. метод с такой сигнатурой уже существует
//        return new Object();
//    }
}
