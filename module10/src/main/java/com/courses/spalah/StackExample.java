package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class StackExample {
    public static void main(String[] args) { // каждый метод составляет отдельный фрейм
        int m = 1; // переменная находится в стеке
        boolean b = false; // переменная находится в стеке
        A();
    }

    public static void A() { // фрейм
        int a = 2; // переменная находится в стеке
        B();
    }

    public static void B() { // фрейм
        int a = 3; // переменная находится в стеке
        double d = 333.333; // переменная находится в стеке
    }
}
