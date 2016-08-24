package com.courses.spalah.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jeka on 16.08.2016.
 */
public class Sets {
    public static void main(String[] args) {
        // базовая реализация Set - HashSet
        Set<User> users = new HashSet<>();

        // Set гарантирует уникальность элементов, по этому 2 одинаковых объекта не могу находится в Set
        users.add(new User("Ivan", 11.0));
        System.out.println(users);
        users.add(new User("Ivan", 11.0));
        System.out.println(users);
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
            if (this == o) return true;
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

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }
}
