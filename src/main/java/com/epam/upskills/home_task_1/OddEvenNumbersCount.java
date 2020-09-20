package com.epam.upskills.home_task_1;

import com.epam.upskills.util.ArrayUtils;

import java.io.IOException;
import java.util.Arrays;

public class OddEvenNumbersCount {
    public static void main(String[] args) throws IOException {
        int[] numbers = ArrayUtils.createArrayFromConsole();
        int evenNumbersCount = getEvenNumbersCount(numbers);
        int oddNumbersCount = getOddNumbersCount(numbers);

        System.out.println("Even numbers count: " + evenNumbersCount);
        System.out.println("Odd numbers count: " + oddNumbersCount);
    }

    private static int getEvenNumbersCount(int[] numbers) {
        int countEvenNumbers = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                countEvenNumbers++;
            }
        }
        return countEvenNumbers;
    }

    private static int getOddNumbersCount(int[] numbers) {
        int countOddNumbers = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                countOddNumbers++;
            }
        }
        return countOddNumbers;
    }
}
