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
        if (ints[ints.length - 1] != 0){
            ints = increaseArray(ints);
        }
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == 0){
                ints[j] = i;
            }
        }
        size ++;
    }

    public int getByIndex(int index) {
        if (index > ints.length - 1){
            throw new IndexOutOfBoundsException();
        }
        return ints[index];
    }

    private int[] increaseArray(int[] array){
        int[] newArray = new int[array.length + 5];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
