package com.putkov.ft.service;

import com.putkov.ft.entity.CustomArray;
import com.putkov.ft.exceptions.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayServiceImpl implements CustomArrayService {
    private static final Logger logger = LogManager.getLogger(CustomArrayServiceImpl.class);


    @Override
    public int findMaxElement(CustomArray customArray) throws CustomException {
        if(customArray ==null || customArray.getArray()==null || customArray.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }
        logger.info("Finding max element for array with id={}", customArray.getId());

        int[] tempArr = customArray.getArray();
        int max = tempArr[0];
        for(int el : tempArr){
            if(el>max){
                max = el;
            }
        }
        return max;
    }

    @Override
    public int findMinElement(CustomArray customArray) throws CustomException{
        if(customArray ==null || customArray.getArray()==null || customArray.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }
        logger.info("Finding mim element for array with id={}", customArray.getId());

        int[] tempArr = customArray.getArray();
        int min = tempArr[0];
        for(int el : tempArr){
            if(el<min){
                min = el;
            }
        }
        return min;
    }

    @Override
    public int sumElements(CustomArray customArray) throws CustomException {
        if(customArray ==null || customArray.getArray()==null || customArray.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }
        logger.info("Finding sum of elements for array with id={}", customArray.getId());


        int[] tempArr = customArray.getArray();
        int sum = 0;
        for (int i = 0; i < tempArr.length; i++) {
            sum+=tempArr[i];
        }
        return sum;
    }

    @Override
    public void arrBubbleSort(CustomArray customArray) throws CustomException{
        if(customArray ==null || customArray.getArray()==null || customArray.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }
        logger.info("Starting bubble sort for array id={}", customArray.getId());

        int[] tempArr = customArray.getArray();
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
            customArray.setValue(i, tempArr[i]);
        }
        logger.info("Bubble sort completed for array id={}", customArray.getId());

    }

    @Override
    public void arrSelectionSort(CustomArray customArray) throws CustomException {
        if(customArray ==null || customArray.getArray()==null || customArray.getLength() ==0){
            throw new CustomException("CustomArr is null or empty");
        }
        logger.info("Starting selection sort for array id={}", customArray.getId());
        int[] tempArr = customArray.getArray();
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
            customArray.setValue(i, tempArr[i]);
        }
        logger.info("Selection sort completed for array id={}", customArray.getId());

    }
}
