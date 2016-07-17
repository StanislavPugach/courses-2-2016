package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class StaticExample {

    static int staticValue = 1111;

    int value = 10;

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        System.out.println(staticExample.value); // поле экземпляра staticExample

        System.out.println(StaticExample.staticValue); // статическое поля класса StaticExample
    }
}
