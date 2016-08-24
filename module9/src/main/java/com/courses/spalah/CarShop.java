package com.courses.spalah;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ievgen Tararaka
 */
public class CarShop {
    public static void main(String[] args) {
        buy();
    }

    public static void buy() {
        try {
            tryBuyACar(); // пробуем купить машину. Этот метод может выкинуть несколько типов исключений.
            putCarToGarage(); // код который будет выполняется в нормальном режиме
            celebrateWithFriends();
        } catch (NotEnoughMoneyException ex) {
            System.out.println("Вам не хватает денег на покупку машины");
        } catch (NoMoreCarsException ex) {
            System.out.println("Простите, но машины закончились");
        } finally {
            pleaseLeaveYourFeedback(); // мы в любом случае хотим попросить оставить отзыв
        }
    }

    public static void buyV2() {
        try {
            tryBuyACar(); // пробуем купить машину. Этот метод может выкинуть несколько типов исключений.
            putCarToGarage(); // код который будет выполняется в нормальном режиме
            celebrateWithFriends();
        } catch (NotEnoughMoneyException | NoMoreCarsException ex) {
            System.out.println("Вам не хватает денег на покупку машины или у вас не хватает денег");
            System.out.println("Ошибка:" + ex.getMessage());
        } catch (Exception ex) {

        } finally {
            pleaseLeaveYourFeedback(); // мы в любом случае хотим попросить оставить отзыв
        }
    }

    public static void tryBuyACar() throws NotEnoughMoneyException, NoMoreCarsException {
        try {
            readPriceFromFile();
        } catch (IOException ex) {
            throw new NoMoreCarsException("Не смогли найти цены на авто", ex);
        }
    }

    public static String readPriceFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("prices.xml"));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    public static String readPriceFromFileV2() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("prices.xml"))) {
            return br.readLine();
        }
    }

    public static double readPriceFromFileOrReturnDefault() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("prices.xml"));
        try {
            return Double.valueOf(br.readLine());
        } finally {
            return 10_000.0F;
        }
    }

    public static void putCarToGarage() {

    }

    public static void celebrateWithFriends() {

    }

    public static void pleaseLeaveYourFeedback() {

    }

    static class NotEnoughMoneyException extends Exception {

    }

    static class NoMoreCarsException extends Exception {
        NoMoreCarsException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
