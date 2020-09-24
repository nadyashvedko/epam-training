package com.epam.upskills.home_task_5;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
//        int[][] mA =
//                {{33, 34, 12},
//                        {33, 19, 10},
//                        {12, 14, 17},
//                        {84, 24, 51},
//                        {43, 71, 21}};
//
//        int[][] mB =
//                {{10, 11, 34, 55},
//                        {33, 45, 17, 81},
//                        {45, 63, 12, 16}};
//
//
//        int m = mA.length;
//        int n = mB[0].length;
//        int o = mB.length;
//        int[][] res = new int[m][n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < o; k++) {
//                    res[i][j] += mA[i][k] * mB[k][j];
//                }
//            }
//        }
//
//        for (int i = 0; i < res.length; i++) {
//            for (int j = 0; j < res[0].length; j++) {
//                System.out.format("%6d ", res[i][j]);
//            }
//            System.out.println();
//        }
    ArrayCreator creator = new ArrayCreator();
    int[] a = creator.fillRandomArray(7,4,10);
    int[] b = creator.fillRandomArray(7,-5,5);
    Multiplicator multiplicator = new Multiplicator();
    int[] result = multiplicator.multiplicator(a,b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("result = " + Arrays.toString(result));
    }

}


