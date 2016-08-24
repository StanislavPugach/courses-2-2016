package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class HeapExample {
    public static void main(String[] args) {
        // ссылка на объект - это локальная переменная, которая хранится в стеке
        // но сам объект хранится в куче
        Worker w1 = new Worker();
        w1.maxWeightLiftKiloGrams = 100; // имея сслыку на обьект мы можем получить доступ к переменным этого объекта
        w1.monthlySalary = 10_000; // переменные объекта хранятся в куче вместе с самим объектом
    }
}
