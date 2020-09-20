package com.epam.upskills.home_task_1;

import com.epam.upskills.util.ArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) throws IOException {
        int[] numbers = ArrayUtils.createArrayFromConsole();
        int[] evenNumbers = new int[getEvenNumbersCount(numbers)];
        int[] oddNumbers = new int[getOddNumbersCount(numbers)];
        int evenNumbersCount = 0;
        int oddNumbersCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenNumbersCount] = number;
                evenNumbersCount++;
            } else {
                oddNumbers[oddNumbersCount] = number;
                oddNumbersCount++;
            }
        }
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));
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
