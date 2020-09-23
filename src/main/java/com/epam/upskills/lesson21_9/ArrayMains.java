package com.epam.upskills.lesson21_9;

import java.util.Arrays;

public class ArrayMains {

    static int countMax = 0;

    public static void main(String[] args) {
        int[] array1 = new int[]{59, 0, -40, 5, 59, 7, 8, 59, -59};
        System.out.println(Arrays.toString(array1));
        int max = array1[0];

        for (int number : array1) {
            if (number > max) {
                max = number;
            }
        }

        for (int number : array1) {
            if (number == max) {
                countMax++;
            }
        }

        System.out.println("Max element: " + max);
        System.out.println("Count of max element: " + countMax);
    }
}
