package com.org.dsa.practice.service;

import java.util.Arrays;

public class SortedSquareArray {
    private int[] inputArray;

    public SortedSquareArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int[] sortedSquares(){
        int[] resultArray = new int[inputArray.length];
        for(int i=0; i< inputArray.length; i++){
            resultArray[i] = Math.abs(inputArray[i] * inputArray[i]);
        }
        Arrays.sort(resultArray);//n log n times default Timsort algorithm
       return resultArray;
    }
}
