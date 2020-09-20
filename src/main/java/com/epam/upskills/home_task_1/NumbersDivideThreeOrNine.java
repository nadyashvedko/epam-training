package com.epam.upskills.home_task_1;

import com.epam.upskills.util.ArrayUtils;

import java.io.IOException;
import java.util.Arrays;

public class NumbersDivideThreeOrNine {
    public static void main(String[] args) throws IOException {
        int[] numbers = ArrayUtils.createArrayFromConsole();
        int[] divideNumbers = new int[getDivideNumbersCount(numbers)];
        int divideNumbersCount = 0;
        for (int number : numbers) {
            if (number % 3 == 0) {
                divideNumbers[divideNumbersCount] = number;
                divideNumbersCount++;
            }
        }
        System.out.println("Numbers, that divide of 3 or 9: " + Arrays.toString(divideNumbers));
    }

    private static int getDivideNumbersCount(int[] numbers) {
        int countDivideNumbers = 0;
        for (int number : numbers) {
            if (number % 3 == 0) {
                countDivideNumbers++;
            }
        }
        return countDivideNumbers;
    }

}
