package com.putkov.ft.specification;

import com.putkov.ft.entity.CustomArray;

public class MinLessThanSpecification implements Specification {
    private final int threshold;

    public MinLessThanSpecification(int threshold) {
        this.threshold = threshold;
    }


    @Override
    public boolean specified(CustomArray customArray) {
        if (customArray == null || customArray.getArray() == null || customArray.getLength() == 0) {
            return false;
        }
        int[] tempArr = customArray.getArray();
        int min = tempArr[0];
        for (int el : tempArr) {
            if (el < min) {
                min = el;
            }
        }
        return min < threshold;
    }
}