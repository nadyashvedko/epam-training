package com.epam.upskills.home_task_5;

public class Multiplicator {
    public int[] multiplicator(int[] a, int[] b) {
        if ((a == null || b == null) && a.length != b.length) {
            throw new IllegalArgumentException();
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }
}
