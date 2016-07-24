package com.courses.spalah.pack;

import java.util.ArrayList;
import java.util.List;

import com.courses.spalah.pack.zoo.*;

import static com.courses.spalah.pack.house.Guard.MAX_HEIGHT_METERS;

/**
 * @author Ievgen Tararaka
 */
public class PackageExample {
    public static void main(String[] args) {
        // использование полного имени класса
        com.courses.spalah.pack.house.Guard houseGuard = new com.courses.spalah.pack.house.Guard();

        // импорт классов List и ArrayList
        List list = new ArrayList<>();

        // импорт статического члена класса
        System.out.println("Максимальная высота ограждения = " + MAX_HEIGHT_METERS);

        // при * импорте мы видим все классы в пакете com.courses.spalah.pack.zoo.
        Monkey monkey = new Monkey();
        monkey.eatBanana();
        Guard guard = new Guard();

    }
}
