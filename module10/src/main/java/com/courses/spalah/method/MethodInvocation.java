package com.courses.spalah.method;

/**
 * @author Ievgen Tararaka
 */
public class MethodInvocation {
    public static void main(String[] args) {
        construction();
    }

    public static void construction() {
        Construction construction = new Construction();
        construction.build();
    }
}
