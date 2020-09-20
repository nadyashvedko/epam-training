package com.epam.upskills.home_task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberDoubler {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter any number: ");
        while (true) {
            try {
                double number = Double.parseDouble(reader.readLine());
                System.out.println(number * 2);
                break;
            } catch (NumberFormatException e) {
                System.out.println("This is not a number. Please, enter valid data");
            }
        }
    }
}
