package com.epam.upskills.home_task_1;

import com.epam.upskills.util.ArrayUtils;

import java.io.IOException;
import java.util.Arrays;

public class NumbersDivideFiveAndSeven {
    public static void main(String[] args) throws IOException {
        int[] numbers = ArrayUtils.createArrayFromConsole();
        int[] divideNumbers = new int[getDivideNumbersCount(numbers)];
        int divideNumbersCount = 0;
        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                divideNumbers[divideNumbersCount] = number;
                divideNumbersCount++;
            }
        }
        System.out.println("Numbers, that divide of 5 and 7: " + Arrays.toString(divideNumbers));
    }

    private static int getDivideNumbersCount(int[] numbers) {
        int countDivideNumbers = 0;
        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                countDivideNumbers++;
            }
        }
        return countDivideNumbers;
    }

}
