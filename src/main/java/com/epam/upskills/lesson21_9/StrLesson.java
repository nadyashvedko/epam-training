package com.epam.upskills.lesson21_9;

import java.util.Arrays;

public class StrLesson {
    public static void main(String[] args) {
       /* int [] a1 = {3,5,7,4,9};
        int [] a2 = {7,4};  Home Task */


        String str = "Java15787";
        String del = "158";
        String res = "";
        for (int i = 0; i < str.length() - 1; i++) {
            String temp = str.substring(i);
            if (temp.startsWith(del)) {
                res+=str.substring(0,i);
                res+=temp.substring(del.length());
                break;
            }
        }
        if(res.isEmpty()){
            System.out.println(del + " not found");
        }
        System.out.println(res);
//        char[] arrayOfChars = str.getChars();
//        for (int i = 0; i < arrayOfChars.length; i++) {
//            if()
//        }
//        StringBuilder sb = new StringBuilder(str);
//        int position = 3;
//        String insert = "ZZZ";
//        sb.insert(position, insert);
//        System.out.println(sb);
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            result += str.charAt(i);
//            if (i == position - 1) {
//                result += insert;
//            }
//
//        }
//        System.out.println(result);
//        int countUpperCase = 0;
//        int countLowerCase = 0;
//        int len = str.length();
//        for (int i = 0; i < len; i++) {
//            char ch = str.charAt(i);
//            if (Character.isAlphabetic(ch)) {
//                if ('A' <= ch && ch <= 'Z') {
//                    countUpperCase++;
//                } else {
//                    countLowerCase++;
//                }
//            }
//        }
//        double resultUp = (double) countUpperCase / len * 100;
//        double resultLow = (double) countLowerCase / len * 100;
//        System.out.println("Upper Case: " + resultUp);
//        System.out.println("Lower Case " + resultLow);


//        String str = "Show must go on";
//        String[] arr = str.split("\\s+");
//        System.out.println(Arrays.toString(arr));
//        String max = arr[0];
//        int countLetters = new int[];
//        char ch = 'H'; // to upper case
//        if('A' <= ch && ch <= 'Z') {
//
//        }


    }
}
