package com.epam.upskills.home_task_3;

import java.util.ArrayList;

public class OddAndEvenNumerals {
    public static void main(String[] args) {
        String string1 = "23455621";
        System.out.println("Numbers: " + string1);
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < string1.length(); i++) {
            char ch = string1.charAt(i);
            int i1 = Character.digit(ch, 10);
            if (i1 % 2 == 0) {
                evenList.add(i1);
            } else {
                oddList.add(i1);
            }
        }
        System.out.println("Even numerals: ");
        for (int numeral : evenList) {
            System.out.print(numeral + " ");
        }
        System.out.println();
        System.out.println("Odd numerals: ");
        for (int numeral:oddList) {
            System.out.print(numeral + " ");
        }
    }
}
