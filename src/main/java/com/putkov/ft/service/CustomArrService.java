package com.putkov.ft.service;

import com.putkov.ft.entity.CustomArr;
import com.putkov.ft.exceptions.CustomException;

public interface CustomArrService {
    int findMaxElement(CustomArr customArr) throws CustomException;
    int findMinElement(CustomArr customArr) throws CustomException;
    int sumElements(CustomArr customArr) throws CustomException;
    void arrBubbleSort(CustomArr customArr) throws CustomException;
    void arrSelectionSort(CustomArr customArr) throws CustomException;
}
