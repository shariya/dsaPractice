package com.org.dsa.practice;

import com.org.dsa.practice.service.MoveElementToEnd;
import com.org.dsa.practice.service.NonConstructiveChange;
import com.org.dsa.practice.service.SmallestDifference;
import com.org.dsa.practice.service.SortedSquareArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //smallest difference invocation
        //System.out.printf("Result" + invokeSmallestDifference());
        //sorted square array invocation
        //System.out.printf("Sorted Square Array: " + Arrays.toString(invokeSortedSquareArray()));
        //sorted move element to end
//        System.out.printf("Move Element to end: " + Arrays.toString(invokeMoveElementToEnd()));
        System.out.printf("Non Constructive change: " + invokeNonConstructiveChange());
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

    private static int invokeNonConstructiveChange(){
        //int[] inputArray = {5,7,1,1,2,3,22};//20
        //int[] inputArray = {1,2,5};//4
       // int[] inputArray = {1,1,4};//3
        //int[] inputArray = {1,4,2};//8
        int[] inputArray = {2,3,4,5};//9
        NonConstructiveChange nonConstructiveChange = new NonConstructiveChange(inputArray);
        return nonConstructiveChange.findNonConstructiveChange();
    }
}