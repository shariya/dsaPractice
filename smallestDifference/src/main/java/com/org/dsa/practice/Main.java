package com.org.dsa.practice;

import com.org.dsa.practice.service.FourNumberSum;
import com.org.dsa.practice.service.SmallestDifference;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //smallest difference invocation
        System.out.printf("Smallest difference Result " + invokeSmallestDifference() + "\n");
        //four number sum invocation
        System.out.printf("Four Number Sum Result " + invokeFourNumberSum());
    }

    private static Map<Integer,Integer> invokeSmallestDifference(){
        int[] arrayList = {-1,5,10,20,28,3};
        int[] arrayList1 = {26,134,135,15,17};
        SmallestDifference smallestDifference = new SmallestDifference(arrayList,arrayList1);
        return smallestDifference.findSmallestDifference();
    }

    private static int[] invokeFourNumberSum(){
        int[] arrayList = {7,6,4,-1,1,2};
        int expectedSum = 16;
        FourNumberSum fourNumberSum = new FourNumberSum(arrayList,expectedSum);
        return fourNumberSum.findFourNumberSum();
    }
}