package com.courses.spalah.incapsulation.bankaccount;

/**
 * @author Ievgen Tararaka
 */
class Bank {
    static Bank COOL_BANK = new Bank("COOL BANK", 100000);

    public String bankName;
    private BankAccount bankAccount; // теперь деньги хранятся на счете банка

    Bank(String bankName, int totalMoneyInBank) {
        this.bankName = bankName;

        bankAccount = new BankAccount();
        bankAccount.setTotalMoneyInBank(totalMoneyInBank);
    }

    int calculateProfitForCurrentMoth() {
        return (int)(bankAccount.getTotalMoneyInBank() * 0.3F);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getTotalMoneyInBank() { // геттер не изменился, но данные реально берутся из другого места
        return bankAccount.getTotalMoneyInBank();
    }
}