package com.org.dsa.practice.service;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    private int[][] inputArray;

    public SpiralMatrix(int[][] inputArray) {
        this.inputArray = inputArray;
    }

    public List<Integer> spiralMatrix(){
        List<Integer> resultList = new ArrayList<>();
        System.out.println("row " + inputArray.length);
        for (int i=0; i < inputArray.length ; i ++) {
            System.out.println("column " + inputArray[i].length);
            for (int j = 0; j < inputArray[i].length; j++) {
                resultList.add(inputArray[i][j]);
            }
        }
        //resultList.sort(Integer::compareTo);
        return resultList;
    }
}
