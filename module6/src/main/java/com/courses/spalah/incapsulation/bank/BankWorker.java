package com.courses.spalah.incapsulation.bank;

/**
 * @author Ievgen Tararaka
 */
public class BankWorker {
    public String name;

    public BankWorker(String name) {
        this.name = name;
    }

    public void sayInformationAboutBank() {
        System.out.println(Bank.COOL_BANK.calculateProfitForCurrentMoth());
    }
}
