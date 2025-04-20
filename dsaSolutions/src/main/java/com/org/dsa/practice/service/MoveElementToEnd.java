package com.org.dsa.practice.service;

import java.util.Arrays;
import java.util.Collections;

public class MoveElementToEnd {
    private int[] inputArray;
    private int elementToMove;

    public MoveElementToEnd(int[] inputArray, int elementToMove) {
        this.inputArray = inputArray;
        this.elementToMove = elementToMove;
    }

    public int[] moveElementToEnd(){
        int startIndex = 0;
        int endIndex = inputArray.length - 1;
        while(startIndex < inputArray.length && startIndex < endIndex){
            if(inputArray[startIndex] == elementToMove && inputArray[endIndex] == elementToMove){//true true
                endIndex--;
            }
            if(inputArray[startIndex] == elementToMove && inputArray[endIndex] != elementToMove) {//true false
                //Collections.swap(Arrays.asList(inputArray),startIndex, endIndex);
                int temp = inputArray[startIndex];
                inputArray[startIndex] = inputArray[endIndex];
                inputArray[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
            if(inputArray[startIndex] != elementToMove && inputArray[endIndex] != elementToMove){//false false
                startIndex++;
            }
            if(inputArray[startIndex] != elementToMove && inputArray[endIndex] == elementToMove){//false true
                endIndex--;
            }
        }
        return inputArray;
    }
}
