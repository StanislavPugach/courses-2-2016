package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Start calculator");
        float previous = 0;

        while (true) {
            String[] arrayOfInputData = readFromConsole();
            if (arrayOfInputData[0].equals("exit")) break;

            float argument_1 = 0.0F;
            String operator = "";
            float argument_2 = 0.0F;
            if (arrayOfInputData.length == 2) {
                argument_1 = previous;
                operator = arrayOfInputData[0];
                argument_2 = Float.parseFloat(arrayOfInputData[1]);
            }
            if (arrayOfInputData.length == 3) {
                argument_1 = Float.parseFloat(arrayOfInputData[0]);
                operator = arrayOfInputData[1];
                argument_2 = Float.parseFloat(arrayOfInputData[2]);
            }

            float result = culculate(argument_1, argument_2, operator);
            previous = result;
            System.out.println(result);
        }


    }

    public static float culculate(float a, float b, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        return result;
    }

    public static String[] readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            return input.split("\\s");
        } catch (IOException e) {
            return new String[]{""};
        }
    }
}
