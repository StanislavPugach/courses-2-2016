package com.courses.spalah.home.work;

/**
 * Created by Пугач Станислав on 17.07.2016.
 */
public class Bank {

    private String Name;
    private Deposit deposit1;
    private Deposit deposit2;
    private Deposit deposit3;

    public Bank(String name) {
        Name = name;
        deposit1 = new Deposit(10_500F, 23.5F, "Vasya");
        deposit2 = new Deposit(25_300F, 25F, "Misha");
        deposit3 = new Deposit(300_000F, 18F, "Vova");
    }

    public float calculateBankProfit(float years) {
        return deposit1.calculateProfit(years) + deposit2.calculateProfit(years) + deposit3.calculateProfit(years);
    }

}
