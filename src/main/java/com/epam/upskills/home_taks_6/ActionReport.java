package com.epam.upskills.home_taks_6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ActionReport {
    public static void printMultiply(int[] a, int[] b, int[] result) {
        System.out.println("Here are multiply arrays: ");
        System.out.println("array a = " + Arrays.toString(a) + "\n" + "array b = " + Arrays.toString(b));
        System.out.println("Multiplication result: " + Arrays.toString(result));
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        System.out.println(LocalDateTime.now().format(customFormatter));
    }
}
