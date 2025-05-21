package com.org.dsa.practice.service;

import java.util.*;

/**
 * The SmallestDifference class provides functionality to find the pair of integers
 * (one from each of two given integer arrays) whose absolute difference is the smallest.
 */
public class SmallestDifference {
    private int[] arrayListA;
    private int[] arrayListB;

    /**
     * Constructs a SmallestDifference instance with two integer arrays.
     *
     * @param arrayListA the first integer array
     * @param arrayListB the second integer array
     */
    public SmallestDifference(int[] arrayListA, int[] arrayListB) {
        this.arrayListA = arrayListA;
        this.arrayListB = arrayListB;
    }

    /**
     * Finds and returns the pair of integers (one from each array) with the smallest absolute difference.
     * The method sorts both arrays and uses a two-pointer approach to efficiently find the smallest difference.
     *
     * @return a Map containing a single entry representing the pair of integers with the smallest difference,
     *         where the key is from the first array and the value is from the second array
     */
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