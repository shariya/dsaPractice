package com.org.dsa.practice.service;

public class SubArraySort {
    private int[] inputArray;

    public SubArraySort(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int[] findSubArrayToBeSorted(){
        if(checkArrayEmptyOrSizeOne())
            return new int[]{-1, 1};
        float minNum = Float.POSITIVE_INFINITY;
        float maxNum = Float.POSITIVE_INFINITY;
        for (int i = 0; i < inputArray.length; i++) {
          if(!checkIfSorted(i, inputArray[i], inputArray)) {
              minNum = Math.min(minNum, inputArray[i]);
              maxNum = Math.max(maxNum, inputArray[i]);
          }
        }
        if(minNum == Float.POSITIVE_INFINITY)
            return new int[]{-1, 1};
        else
            return new int[]{findStartIndex(minNum), findEndIndex(maxNum)};
    }

    private boolean checkIfSorted(int index, int num, int[] inputArray) {
        if (index == 0) {
            return num <= inputArray[index + 1];
        } else if (index == inputArray.length - 1) {
            return num >= inputArray[index - 1];
        } else {
            return num >= inputArray[index - 1] && num <= inputArray[index + 1];
        }
    }

    private int findStartIndex(float minimumNum) {
        int startIndex = 0;
        while(inputArray[startIndex] <= minimumNum) {
            startIndex++;
        }
        return startIndex;
    }
    private int findEndIndex(float maxNum) {
        int endIndex = inputArray.length - 1;
        while(inputArray[endIndex] >= maxNum) {
            endIndex--;
        }
        return endIndex;
    }

    private boolean checkArrayEmptyOrSizeOne(){
      return (inputArray.length == 0 || inputArray.length == 1);
    }
}
