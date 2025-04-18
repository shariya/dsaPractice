package com.org.dsa.practice;

import com.org.dsa.practice.service.SmallestDifference;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //smallest difference invocation
        System.out.printf("Result" + invokeSmallestDifference());
    }

    private static Map<Integer,Integer> invokeSmallestDifference(){
        int[] arrayList = {-1,5,10,20,28,3};
        int[] arrayList1 = {26,134,135,15,17};
        SmallestDifference smallestDifference = new SmallestDifference(arrayList,arrayList1);
        return smallestDifference.findSmallestDifference();
    }
}