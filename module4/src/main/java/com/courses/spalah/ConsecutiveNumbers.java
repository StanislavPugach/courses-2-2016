package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class ConsecutiveNumbers {
    /**
     * Написать программу, которая отвечает на вопрос:
     * "Содержит ли введенная строка правильную последовательность цифр?"
     * <p>
     * Входные параметры программы:
     * 1. Строка с числами (только целые числа, которые не больше, чем int)
     * 2. Разделительный символ для этой строки. Разделительный символ в строке может быть любой, пустой в том числе.
     * <p>
     * Например:
     * Строка - 1*2*3*6*7
     * Символ - *
     * Ответ - false
     *
     * @param args - аргументы коммандной строки
     */
    public static void main(String[] args) {
        String[] arrayOfNumbers = args[0].split(args[1]);

        if (isArrayConsistent(arrayOfNumbers)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    private static boolean isArrayConsistent(String[] array) {
        boolean result = false;
        for (int i = 0; i < array.length - 1; i++) {

            if (Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]) == 1) {
                result = true;
            } else {
                result = false;
                break;
            }

        }
        return result;
    }
}
