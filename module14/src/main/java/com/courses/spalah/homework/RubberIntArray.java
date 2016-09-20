package com.courses.spalah.homework;

import java.util.Arrays;

/**
 * @author Ievgen Tararaka
 */
public class RubberIntArray {
    private static int[] ints = new int[10];
    private static final int increase = 5;
    private int size = 0;
    /**
     * Добавляет элемент в массив. Если размер массива не позволяет добавить элемент - его необходимо увеличить на 5.
     *
     * @param i элемент, который необходимо добавить в массив
     */
    public void add(int i) {
        // TODO ваш код должен быть тут
        if (ints[ints.length - 1] != 0){
            ints = increaseArray(ints);
        }
        ints[size + 1] = i;
        size ++;
    }

    public int getByIndex(int index) {
        if (index > ints.length - 1){
            throw new IndexOutOfBoundsException("Element with this index not exist");
        }
        return ints[index];
    }

    private int[] increaseArray(int[] array){
        int[] newArray = new int[array.length + increase];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
