package com.courses.spalah;

import java.util.Arrays;

/**
 * Created by Stanislav Pugach on 05.09.2016.
 */
class MyString {
    private char[] arrayOfChars;

    public MyString(char... chars) {
        this.arrayOfChars = chars;
    }

    public void print() {
        System.out.println(Arrays.toString(arrayOfChars));
    }

    public void reverse() {
        for (int i = 0; i < arrayOfChars.length / 2; i++) {
            char num = arrayOfChars[i];
            arrayOfChars[i] = arrayOfChars[arrayOfChars.length - i - 1];
            arrayOfChars[arrayOfChars.length - i - 1] = num;
        }
    }

    public int length() {
        return arrayOfChars.length;
    }

    public char getByIndex(int index) {
        return arrayOfChars[index];
    }
}
