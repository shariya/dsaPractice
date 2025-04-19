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
        Arrays.sort(resultArray);//n log n times default Quicksort algorithm
       return resultArray;
    }

    public int[] sortedSquareOptimal(){
        int[] resultArray = new int[inputArray.length];
        int startIndex =0;
        int endIndex = inputArray.length-1;
        for(int index = inputArray.length-1; index >= 0; index--){
            int startIndexValue = inputArray[startIndex];
            int endIndexValue = inputArray[endIndex];
            if(Math.abs(startIndexValue) > Math.abs(endIndexValue)){
                resultArray[index] = startIndexValue * startIndexValue;
                startIndex++;
            }else{
                resultArray[index] = endIndexValue * endIndexValue;
                endIndex--;
            }
        }
        return resultArray;
    }
}
