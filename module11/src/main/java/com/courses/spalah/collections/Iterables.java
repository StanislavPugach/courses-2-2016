package com.courses.spalah.collections;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Ievgen Tararaka
 */
public class Iterables {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("11111111");

        // базовый методы интерфейса Iterable
        Iterator<String> iterator = list.iterator();

        int count = 1;
        // hasNext проверяет есть ли следующий элемент в коллекции
        while (iterator.hasNext()){
            // метод next возвращает текущий элемент и сдвигает указатель вперед
            String element = iterator.next();
            if (count % 2 == 0) {
                // метод remove удаляет текущий элемент
                iterator.remove();
            } else {
                System.out.println(element);
            }
            count++;
        }

        for (String element : list) { // неявное использование итератора с помощью конструкции foreach
            System.out.println(element);
        }
    }
}
