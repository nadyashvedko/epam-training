package com.epam.upskills.home_task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenNumeralsSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println("Even numerals sum: " + getEvenNumeralsSum(number, 0));
        System.out.println("Odd numerals sum: " + getOddNumeralsSum(number,0));
        System.out.println("Product of numerals: " + getNumeralsProduct(number,1));
        System.out.println("Sum of numerals: "+ getNumeralsSum(number,0));

    }

    private static int getEvenNumeralsSum(int number, int sum) {
        if (number == 0) {
            return sum;
        }
        int numeral = number % 10;
        sum = sum + (numeral % 2 == 0 ? numeral : 0);
        return getEvenNumeralsSum(number / 10, sum);
    }

    private static int getOddNumeralsSum(int number, int sum) {
        if (number == 0) {
            return sum;
        }
        int numeral = number % 10;
        sum = sum + (numeral % 2 != 0 ? numeral : 0);
        return getOddNumeralsSum(number / 10, sum);
    }
    private static int getNumeralsProduct(int number, int product){
        if(number == 0){
            return product;
        }
        int numeral = number%10;
        product = product*numeral;
        return getNumeralsProduct(number/10,product);
    }
    private static int getNumeralsSum(int number, int sum) {
        if (number == 0) {
            return sum;
        }
        int numeral = number % 10;
        sum = sum + numeral;
        return getNumeralsSum(number / 10, sum);
    }
}
