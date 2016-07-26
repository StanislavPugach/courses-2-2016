package com.courses.spalah.home.work;

/**
 * Created by Пугач Станислав on 24.07.2016.
 */
public class Credit {

    private int CreditValue;
    private float Rate;
    private float Years;

    public Credit(int creditValue, float rate, float years) {
        CreditValue = creditValue;
        Rate = rate;
        Years = years;
    }

    public float calculateCreditProfit(int years) {
        return (CreditValue * Rate / 100) * years;
    }

    public float getYears() {
        return Years;
    }
}
