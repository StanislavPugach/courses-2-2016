package com.courses.spalah.incapsulation;

import com.courses.spalah.incapsulation.bank.BankWorker;

/**
 * @author Ievgen Tararaka
 */
public class Client {
    public String name; // имя клиента могу знать все
    protected int age; // его возраст знают только наследники класса Client

    public static void main(String[] args) {
        BankWorker addie = new BankWorker("addie");
        addie.sayInformationAboutBank();
    }
}
