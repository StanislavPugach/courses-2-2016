package com.courses.spalah;

/**
 * Created by Пугач Станислав on 01.08.2016.
 */
 class Bet {
    private Bets bet;
    private float amount;
    private String userName;
    private int number;

    public Bet(Bets bet, String user, float amount) {
        this.bet = bet;
        this.userName = user;
        this.amount = amount;
    }

    public Bet(Bets bet, float amount, String user, int number) {
        this.bet = bet;
        this.amount = amount;
        this.userName = user;
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public float getAmount() {
        return amount;
    }

    public int getNumber() {
        return number;
    }

    public Bets getBet() {
        return bet;
    }
}
