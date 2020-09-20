package com.epam.upskills.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayUtils {
    public static int[] createArrayFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter please size of array: ");
        int nArraySize = Integer.parseInt(reader.readLine());
        int[] numbers = new int[nArraySize];
        System.out.println("Enter please "+ nArraySize +" numbers: ");
        for (int i = 0; i < nArraySize; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        return numbers;
    }
}
