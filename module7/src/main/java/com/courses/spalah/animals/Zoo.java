package com.courses.spalah.animals;

import com.courses.spalah.animals.*;

/**
 * Created by Jeka on 26.07.2016.
 */
public class Zoo {
    public static void main(String[] args) {
        animals();
    }

    public static void animals() {
        Cat cat = new Cat(); // создаем экмемпляр класса Cat
        cat.move(); // так как кошка реализует CanMove, то вызываем метод move()

        // Cat также является CanDoSound по этому мы можем присвоить ссылку на
        // CanDoSound нашему экземпляру класса Cat
        CanDoSound catSound = cat;
        catSound.doSound(); // вызываем doSound()

        // Все классы животных должны определить метод doSound() для того, чтобы не быть абстрактными
        // по этому все животные умеют делать doSound()
        Animal cow = new Cow();
        cow.doSound();

        Dog dog = new Dog();
        dog.doSound();
    }
}
