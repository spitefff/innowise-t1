package com.putkov.ft.service;

import com.putkov.ft.entity.CustomArr;
import com.putkov.ft.exceptions.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrServiceImpl implements  CustomArrService{
    private static final Logger logger = LogManager.getLogger(CustomArrServiceImpl.class);


    @Override
    public int findMaxElement(CustomArr customArr) throws CustomException {
        if(customArr==null || customArr.getArray()==null || customArr.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }

        int[] tempArr = customArr.getArray();
        int max = tempArr[0];
        for(int el : tempArr){
            if(el>max){
                max = el;
            }
        }
        return max;
    }

    @Override
    public int findMinElement(CustomArr customArr) throws CustomException{
        if(customArr==null || customArr.getArray()==null || customArr.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }
        int[] tempArr = customArr.getArray();
        int min = tempArr[0];
        for(int el : tempArr){
            if(el<min){
                min = el;
            }
        }
        return min;
    }

    @Override
    public int sumElements(CustomArr customArr) throws CustomException {
        if(customArr==null || customArr.getArray()==null || customArr.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }

        int[] tempArr = customArr.getArray();
        int sum = 0;
        for (int i = 0; i < tempArr.length; i++) {
            sum+=tempArr[i];
        }
        return sum;
    }

    @Override
    public void arrBubbleSort(CustomArr customArr) throws CustomException{
        if(customArr==null || customArr.getArray()==null || customArr.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }

        int[] tempArr = customArr.getArray();
        for (int i = 0; i < tempArr.length-1; i++) {
            for (int j = 0; j < tempArr.length-i-1 ; j++) {
                if (tempArr[j]>tempArr[j+1]) {
                    int temp = tempArr[j];
                    tempArr[j] = tempArr[j + 1];
                    tempArr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < tempArr.length; i++) {
            customArr.setValue(i, tempArr[i]);
        }
    }

    @Override
    public void arrSelectionSort(CustomArr customArr) throws CustomException {
        if(customArr==null || customArr.getArray()==null || customArr.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }
        int[] tempArr = customArr.getArray();
        for (int i = 0; i < tempArr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < tempArr.length; j++) {
                if(tempArr[j]<tempArr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = tempArr[minIndex];
            tempArr[minIndex] = tempArr[i];
            tempArr[i] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            customArr.setValue(i, tempArr[i]);
        }
    }
}
