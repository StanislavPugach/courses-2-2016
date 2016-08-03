package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.courses.spalah.Command.getExactCommand;

/**
 * Класс-стартер для вашей реализации рулетки
 */
public class ConsoleRoulette {
    private static boolean loopGame = true;

    public static void main(String[] args) {
        // создание рулетки
        Roulette roulette = new Roulette();
        roulette.generate();

        while (loopGame) {
            String[] command = readFromConsole();
            Command exactCommand = getExactCommand(command);
            exactCommand.execute();
        }

    }

    private static String[] readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            return input.split("\\s");
        } catch (IOException e) {
            return new String[]{""};
        }
    }

    public static void setLoopGame(boolean loopGame) {
        ConsoleRoulette.loopGame = loopGame;
    }
}
