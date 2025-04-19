package com.org.dsa.practice.service;

import java.util.*;

public class SmallestDifference {
    private int[] arrayListA;
    private int[] arrayListB;

    public SmallestDifference(int[] arrayListA, int[] arrayListB) {
        this.arrayListA = arrayListA;
        this.arrayListB = arrayListB;
    }

    public Map<Integer, Integer> findSmallestDifference() {
        Map<Integer, Integer> result = new HashMap<>();
        Arrays.sort(arrayListA);
        Arrays.sort(arrayListB);
        int indexOne = 0;
        int indexTwo = 0;
        float smallestDiff = Float.POSITIVE_INFINITY;
        while (indexOne < arrayListA.length && indexTwo < arrayListB.length){
            int currentDiff;
            int num1 = arrayListA[indexOne];
            int num2 = arrayListB[indexTwo];
            if(num1 < num2) {
                currentDiff = num2 - num1;
                indexOne += 1;
            }
            else if (num2 < num1) {
                currentDiff = num1 - num2;
                indexTwo += 1;
            }
            else {
                result.put(num1, num2);
                return result;
            }
            if(currentDiff < smallestDiff){
                smallestDiff = currentDiff;
                result.clear();
                result.put(num1, num2);
            }
        }
        return result;
    }
}
