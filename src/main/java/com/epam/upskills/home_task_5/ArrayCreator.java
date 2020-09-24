package com.epam.upskills.home_task_5;

public class ArrayCreator {
    public int[] fillRandomArray(int size, int begin, int end){
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)((Math.random()*(end - begin)*1));
        }
        return array;
    }
}
