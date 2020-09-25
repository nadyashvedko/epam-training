package com.epam.upskills.lesson25_9;

public class ArrayVector {
    private long arrayId;
    private int[] arr;

    public ArrayVector() {
    }


    public ArrayVector(int[] arr) {
        this.arr = arr;
    }
    public int getLength() {
        return arr.length;
    }

    public long getArrayId() {
        return arrayId;
    }

    public void setArrayId(long arrayId) {
        this.arrayId = arrayId;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
