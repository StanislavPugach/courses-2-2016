package com.courses.spalah.homework;

/**
 * @author Ievgen Tararaka
 */
public class RubberIntArray {
    private int[] ints = new int[10];
    private int size = 0;

    /**
     * Добавляет элемент в массив. Если размер массива не позволяет добавить элемент - его необходимо увеличить на 5.
     *
     * @param i элемент, который необходимо добавить в массив
     */
    public void add(int i) {
        // TODO ваш код должен быть тут
        size ++;
    }

    public int getByIndex(int index) {
        return ints[index];
    }
}
