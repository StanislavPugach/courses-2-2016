package com.courses.spalah.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Jeka on 16.08.2016.
 */
public class Lists {
    public static void main(String[] args) {
        // две базовые реализации интефейса List
        List<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();

        list1.add("one");
        list1.add("three");
        System.out.println(list1);

        list1.add(0, "two");

        // List позволяет нам работать с индексами элементов
        System.out.println(list1);
        // получение элемента по индексу
        System.out.println(list1.get(2));
        // удаление элемента по индексу
        System.out.println(list1.remove(0));
        System.out.println(list1);

        list2.add("one");
        list2.add("three");
        // добавление элемента по индексу
        list2.add(0, "two");

        // LinkedList реализует интерфейса Queue и List одновременно
        System.out.println(list2.peek());
        System.out.println(list2);
        System.out.println(list2.poll());
        System.out.println(list2);
    }
}
