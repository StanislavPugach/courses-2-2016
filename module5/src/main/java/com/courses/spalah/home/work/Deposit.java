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

    public float Profit(float years) {
        return  (InitialDepositAmount*InterestRate/100)*years;
    }
}
