package com.epam.upskills.home_taks_6;

import com.epam.upskills.util.ArrayUtils;
import com.epam.upskills.util.ConsoleReader;

import java.io.IOException;

public class ArrayMain {
    public static void main(String[] args) throws IOException {
        ArrayCreator creator = new ArrayCreator();
        System.out.println("Enter size of array: ");
        int sizeArray = ConsoleReader.readIntLine();
        if (sizeArray > 0) {
            int[] a = ArrayUtils.createArrayFromConsole(sizeArray);
            int[] b = ArrayUtils.createArrayFromConsole(sizeArray);
            Multiplicator multiplicator = new Multiplicator();
            int[] result = multiplicator.multiply(a, b);
            ActionReport.printMultiply(a, b, result);
        } else {
            System.out.println("Enter please positive size of array");
        }
    }
}
