package com.epam.upskills.home_taks_6;

public class ArrayCreator {
    public int[] fillRandomArray(int size, int minValue, int maxValue) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) ((Math.random() * (maxValue - minValue)) + minValue);
        }
        return array;
    }
}
