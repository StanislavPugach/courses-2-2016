package com.courses.spalah.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ievgen Tararaka
 */
public class Maps {
    public static void main(String[] args) {
        // HashMap - базовая реализация интерфейса Map
        Map<Long, String> map = new HashMap<>();

        // ложим пару ключ-значения в Map
        map.put(1L, "one");
        map.put(2L, "two");
        map.put(3L, "threeeee");
        // put с уже существующим ключем заменяет его значение на новое
        map.put(3L, "three");

        // получение значения по ключу
        System.out.println(map.get(2L));
        // получает null, если значения по такому ключу нет
        System.out.println(map.get(4L));
        // получение всех ключей
        System.out.println(map.keySet());
        // получение всех значений
        System.out.println(map.values());
        // получение всех пар ключ-значение
        System.out.println(map.entrySet());
    }
}
