package com.courses.spalah.home.work;

/**
 * Created by Пугач Станислав on 17.07.2016.
 */
public class Deposit {

    private float InitialDepositAmount;
    private float InterestRate;
    private String Name;

    public Deposit(float initialDepositAmount, float interestRate, String name) {
        InitialDepositAmount = initialDepositAmount;
        InterestRate = interestRate;
        Name = name;
    }

    public float calculateProfit(float years) {
        float result = InitialDepositAmount;
        for (int i = 0; i < years; i++) {
            result += InitialDepositAmount * InterestRate /100;
        }
        return  result - InitialDepositAmount;
    }
}
