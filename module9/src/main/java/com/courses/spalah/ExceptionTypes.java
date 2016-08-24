package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class ExceptionTypes {
    public static void main(String[] args) throws Exception {
        checked();
        unchecked();
    }

    public static void checked() throws Exception {
        throw new Exception();
    }

    public static void unchecked() {
        throw new RuntimeException();
    }
}
