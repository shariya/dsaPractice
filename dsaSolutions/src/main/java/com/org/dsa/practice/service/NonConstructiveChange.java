package com.org.dsa.practice.service;

import java.util.Arrays;

/*
Non-Constructible Change
Given an array of positive integers representing the values of coins in your possession, write a function that returns the minimum amount of change (the minimum sum of money) that you cannot create. The given coins can have any positive integer value and aren't necessarily unique (i.e., you can have multiple coins of the same value).
For example, if you're given coins = [1, 2, 5], the minimum amount of change that you can't create is 4. If you're given no coins, the
minimum amount of change that you can't create is
1
Sample Input
coins = [5, 7, 1, 1, 2, 3, 22]
Sample Output
20
 */
public class NonConstructiveChange {
    private int[] inputArray;

    public NonConstructiveChange(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int findNonConstructiveChange(){
        int i=0;
        int change = 0;
        Arrays.sort(inputArray);
        while(i<inputArray.length-1){
            change = change + inputArray[i];
            if(change+1 < inputArray[i+1]){
                return change + 1;
            }
            i++;
        }
        return change+inputArray[inputArray.length-1]+1;
    }
}
