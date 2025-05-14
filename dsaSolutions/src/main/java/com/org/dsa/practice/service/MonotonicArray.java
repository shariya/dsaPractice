package com.org.dsa.practice.service;

public class MonotonicArray {
    private int[] inputArray;

    public MonotonicArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public boolean isMonotonicArray(){
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        boolean isMonotonic = false;
        boolean isEquals = false;
        for(int i = 0; i < inputArray.length-1; i++) {
           if(inputArray[i] < inputArray[i+1]){
               isIncreasing = true;
           } else if(inputArray[i] > inputArray[i+1]){
               isDecreasing = true;
           } else if(inputArray[i] == inputArray[i+1]){
               isEquals = true;
           }
           if(!isMonotonic && (isIncreasing || isDecreasing)){
               isMonotonic = true;
           } else if(isMonotonic){
               if((isIncreasing == isDecreasing) && !isEquals){
                   isMonotonic = false;
                   break;
               }
           } else if(!isMonotonic && !isIncreasing && !isDecreasing && isEquals){
               isMonotonic = true;
           }
        }
        return isMonotonic;
    }
}
