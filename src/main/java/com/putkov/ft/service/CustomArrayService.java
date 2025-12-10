package com.putkov.ft.service;

import com.putkov.ft.entity.CustomArray;
import com.putkov.ft.exceptions.CustomException;

public interface CustomArrayService {
    int findMaxElement(CustomArray customArray) throws CustomException;
    int findMinElement(CustomArray customArray) throws CustomException;
    int sumElements(CustomArray customArray) throws CustomException;
    void arrBubbleSort(CustomArray customArray) throws CustomException;
    void arrSelectionSort(CustomArray customArray) throws CustomException;
}
