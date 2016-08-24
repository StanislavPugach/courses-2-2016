package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class SimpleExample {
    public static void main(String[] args) {
        divideByZero();
    }

    public static int divideByZero() {
        return 5 / 0; // деление на 0 - недопустимая арифметическая операция
    }
}
