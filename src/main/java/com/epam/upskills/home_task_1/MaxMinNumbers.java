package com.epam.upskills.home_task_1;

import com.epam.upskills.util.ArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMinNumbers {
    public static void main(String[] args) throws IOException {
        int[] numbers = ArrayUtils.createArrayFromConsole();
        System.out.println("max element is "+ maxElementOfArray(numbers));
        System.out.println("min element is "+ minElementOfArray(numbers));
    }


    public static int maxElementOfArray(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    public static int minElementOfArray(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
