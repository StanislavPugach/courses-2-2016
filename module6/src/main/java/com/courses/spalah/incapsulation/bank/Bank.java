package com.courses.spalah.incapsulation.bank;

/**
 * @author Ievgen Tararaka
 */
class Bank { // о классе Bank знаеют только другие классы в пакете com.courses.spalah.incapsulation.bank
    static Bank COOL_BANK = new Bank("COOL BANK", 100000);

    public String bankName; // имя банка это публичная информация
    private int totalMoneyInBank; // никто не может знать сколько всего денег в банке

    Bank(String bankName, int totalMoneyInBank) { // конструктор также виден только в этом пакете
        this.bankName = bankName;
        this.totalMoneyInBank = totalMoneyInBank;
    }

    int calculateProfitForCurrentMoth() { // о доходе банка за текущий месяц может знать только класс в том же пакете
        return (int)(totalMoneyInBank * 0.3F);
    }

    public String getBankName() { // геттер для имени банка
        return bankName;
    }

    public void setBankName(String bankName) { // сеттер для имени банка
        this.bankName = bankName;
    }

    public int getTotalMoneyInBank() { // геттер для количества денег в банке
        return totalMoneyInBank;
    }

    // сеттер для имени банка отсутствует, так как мы не хотим не кому давать возможность уменьшать кол-во денег в банке
}
