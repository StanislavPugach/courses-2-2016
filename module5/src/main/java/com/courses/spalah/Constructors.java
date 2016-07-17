package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class Constructors {
    int intValue;
    double doubleValue;
    char charValue;

    public Constructors() { // по умолчанию
    }

    public Constructors(int intValueFromConstructor, double doubleValueValueFromConstructor, char charValueValueFromConstructor) {
        intValue = intValueFromConstructor;
        doubleValue = doubleValueValueFromConstructor;
        charValue = charValueValueFromConstructor;
    }

    public Constructors(int intValue, double doubleValue) {
        this(intValue, doubleValue, '0'); // вызов конструктора из конструктора
    }
}
