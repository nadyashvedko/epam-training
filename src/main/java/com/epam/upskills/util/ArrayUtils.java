package com.epam.upskills.util;

import java.io.IOException;

public class ArrayUtils {
    public static int[] createArrayFromConsole() throws IOException {
        System.out.println("Enter please size of array: ");
        int nArraySize = ConsoleReader.readIntLine();
        int[] numbers = new int[nArraySize];
        System.out.println("Enter please " + nArraySize + " numbers: ");
        for (int i = 0; i < nArraySize; i++) {
            numbers[i] = ConsoleReader.readIntLine();
        }
        return numbers;
    }

    public static int[] createArrayFromConsole(int arraySize) throws IOException {
        int[] numbers = new int[arraySize];
        System.out.println("Enter please " + arraySize + " numbers: ");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = ConsoleReader.readIntLine();
        }
        return numbers;
    }
}
