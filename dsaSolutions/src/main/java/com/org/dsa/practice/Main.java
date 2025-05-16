package com.org.dsa.practice;

import com.org.dsa.practice.service.MoveElementToEnd;
import com.org.dsa.practice.service.SmallestDifference;
import com.org.dsa.practice.service.SortedSquareArray;
import com.org.dsa.practice.service.SpiralMatrix;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //smallest difference invocation
        //System.out.printf("Result" + invokeSmallestDifference());
        //sorted square array invocation
        //System.out.printf("Sorted Square Array: " + Arrays.toString(invokeSortedSquareArray()));
        //sorted move element to end
//        System.out.printf("Move Element to end: " + Arrays.toString(invokeMoveElementToEnd()));
        System.out.printf("Spiral Matrix: " + invokeSpiralMatrix());
    }

    private static Map<Integer,Integer> invokeSmallestDifference(){
        int[] arrayList = {-1,5,10,20,28,3};
        int[] arrayList1 = {26,134,135,15,17};
        SmallestDifference smallestDifference = new SmallestDifference(arrayList,arrayList1);
        return smallestDifference.findSmallestDifference();
    }

    private static int[] invokeSortedSquareArray(){
        int[] inputArray = {-7,-5,-4,3,6,8,9};
        SortedSquareArray sortedSquareArray = new SortedSquareArray(inputArray);
        //return sortedSquareArray.sortedSquares();
        return sortedSquareArray.sortedSquareOptimal();
    }
    private static int[] invokeMoveElementToEnd(){
        //int[] inputArray = {2,1,2,3,4,2,5,6};
        int[] inputArray = {2,1,2,2,2,3,4,2};
        int elementToMove = 2;
        MoveElementToEnd moveElementToEnd = new MoveElementToEnd(inputArray,elementToMove);
        return moveElementToEnd.moveElementToEnd();
    }

    private static List<Integer> invokeSpiralMatrix(){
        int[][] inputArray =  {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        SpiralMatrix spiralMatrix = new SpiralMatrix(inputArray);
        return spiralMatrix.spiralMatrix();
    }
}