package com.courses.spalah.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author Ievgen Tararaka
 */
public class Collections {
    public static void main(String[] args) {
        Collection<Long> longs = new ArrayDeque<>();

        // добавление элементов в коллекцию
        longs.add(1L);
        longs.add(12311L);
        longs.add(13123L);
        longs.add(555L);
        longs.add(12313L);

        // базовые методы интерфейса Collection
        System.out.println(longs.size());
        System.out.println(longs.isEmpty());
        System.out.println(longs.contains(555L));
        System.out.println(Arrays.toString(longs.toArray()));
        System.out.println(longs.remove(1L));

        System.out.println(longs);

        users();
    }

    public static void users() {
        Collection<User> users = new ArrayList<>();
        User ivan = new User("Ivan", 1.0);
        users.add(ivan);

        System.out.println(users.contains(new User("Ivan", 12312313123.0))); // false т.к. 2 сущности не равный по equals
    }

    public static class User {
        private String name;
        private double balance;

        public User(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        @Override
        // всегда важно переопределять метод equals для правильной работы с коллекциями
        public boolean equals(Object o) {
            if (o == null) return false;
            if (!(o instanceof User)) return false;

            User user = (User) o;

            if (Double.compare(user.balance, balance) != 0) return false;
            return name != null ? name.equals(user.name) : user.name == null;
        }

        @Override
        // если вы переопределили equals, то обязательно переопределите hashCode
        public int hashCode() {
            int result;
            long temp;
            result = name != null ? name.hashCode() : 0;
            temp = Double.doubleToLongBits(balance);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }
}
