package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class Return {
    public int showReturns(int command) {
        switch (command) {
            case 1:
                System.out.println("Command ONE");
                return 1;
            case 2:
                System.out.println("COMMAND TWO");
                return 2;
            default:
                System.out.println("UNKNOWN COMMAND");
                return 0;
        }
    }
}
