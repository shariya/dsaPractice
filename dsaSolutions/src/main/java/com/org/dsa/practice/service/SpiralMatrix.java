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
        for (int[] ints : inputArray) {
            for (int j = 0; j < inputArray.length; j++) {
                resultList.add(ints[j]);
            }
        }
        resultList.sort(Integer::compareTo);
        return resultList;
    }
}
