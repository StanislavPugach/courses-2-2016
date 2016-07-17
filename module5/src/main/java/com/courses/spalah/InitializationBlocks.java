package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class InitializationBlocks {
    static int count = 0;

    static {
        count ++;
    }

    String name;
    double value;

    {
        name = "Artur" + " " + "Ivas";

        double helper = Math.PI * 0.33;

        value = helper / 2;
    }
}
