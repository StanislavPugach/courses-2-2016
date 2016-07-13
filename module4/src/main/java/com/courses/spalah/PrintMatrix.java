package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class PrintMatrix {
    /**
     * Написать программу, печатает двумерный массив заданного размера
     * квадратом и 4-мя треугольниками.
     *
     * Входные параметры программы:
     * 1. Размер массива
     * 2. Символ для печати
     *
     * Пример
     * Размер массива - 5
     * Символ для печати - #
     * <p>
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * <p>
     * #
     * # #
     * # # #
     * # # # #
     * # # # # #
     * <p>
     * # # # # #
     * # # # #
     * # # #
     * # #
     * #
     * <p>
     *         #
     *       # #
     *     # # #
     *   # # # #
     * # # # # #
     * <p>
     * # # # # #
     *   # # # #
     *     # # #
     *       # #
     *         #
     * @param args - размер массива
     */
    public static void main(String[] args) {
        int sizeOfarray = Integer.parseInt(args[0]);
        String simbol = args[1];

        printSquare(sizeOfarray, simbol);
        System.out.println();
        printLeftDownSideOfSquare(sizeOfarray, simbol);
        System.out.println();
        printLeftUpSideOfSquare(sizeOfarray, simbol);
        System.out.println();
        printRightDownSideOfSquare(sizeOfarray, simbol);
        System.out.println();
        printRightUpSideOfSquare(sizeOfarray, simbol);
    }

    public static void printSquare(int sizeOfarray, String simbol) {
        for (int i = 0; i < sizeOfarray; i++) {
            for (int j = 0; j < sizeOfarray; j++) {
                System.out.print(simbol + " ");
            }
            System.out.println();
        }
    }

    public static void printLeftDownSideOfSquare(int sizeOfarray, String simbol) {
        int InSize = 1;
        for (int i = 0; i < sizeOfarray; i++) {
            for (int j = 0; j < InSize; j++) {
                System.out.print(simbol + " ");
            }
            System.out.println();
            InSize++;
        }
    }

    public static void printLeftUpSideOfSquare(int sizeOfarray, String simbol) {
        int InSize = sizeOfarray;
        for (int i = 0; i < sizeOfarray; i++) {
            for (int j = 0; j < InSize; j++) {
                System.out.print(simbol + " ");
            }
            System.out.println();
            InSize--;
        }
    }

    public static void printRightDownSideOfSquare(int sizeOfarray, String simbol) {
        int SpaceCount = sizeOfarray - 1;
        for (int i = 0; i < sizeOfarray; i++) {
            for (int j = 0; j < sizeOfarray; j++) {
                if (SpaceCount > j) System.out.print("  ");
                else System.out.print(simbol + " ");
            }
            System.out.println();
            SpaceCount--;
        }
    }

    public static void printRightUpSideOfSquare(int sizeOfarray, String simbol) {
        int SpaceCount = 0;
        for (int i = 0; i < sizeOfarray; i++) {
            for (int j = 0; j < sizeOfarray; j++) {
                if (SpaceCount <= j) System.out.print(simbol + " ");
                else System.out.print("  ");
            }
            System.out.println();
            SpaceCount++;
        }
    }
}
