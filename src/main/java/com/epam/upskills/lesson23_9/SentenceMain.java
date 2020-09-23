package com.epam.upskills.lesson23_9;

import java.util.Arrays;
import java.util.Scanner;

public class SentenceMain {
    public static void main(String[] args) {
        String sentence = "Hello, Java language"; //получить массив строк

        String[] words = sentence.split("[,]?\\s+"); //1 способ.разбиваем строку на слова через пробелы
        int minLengthWord = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) { // поиск длины самого короткого слова
            int temp = words[i].length();
            if (temp < minLengthWord) {
                minLengthWord = temp;
            }
        }
        System.out.println(minLengthWord);
        System.out.println(Arrays.toString(words));

        Scanner scanner = new Scanner(sentence);//2 способ. разбиваем строку на слова
        scanner.useDelimiter("[,]?\\s+"); //удаляем запятые
        int minLengthWordTwo = Integer.MAX_VALUE;
        while (scanner.hasNext()) {
            String str = scanner.next(); //считываем слова по одному
            int temp = str.length();
            if (temp < minLengthWordTwo) {  //поиск самого короткого слова
                minLengthWordTwo = temp;
//            System.out.println(str);
            }


        }
        System.out.println(minLengthWordTwo);
    }
}
