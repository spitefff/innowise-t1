package com.putkov.ft.specification;

import com.putkov.ft.entity.CustomArray;

public class MaxEqualsSpecification implements Specification{
    private final int target;

    public MaxEqualsSpecification(int target) {
        this.target = target;
    }


    @Override
    public boolean specified(CustomArray customArray) {
        if (customArray == null || customArray.getArray() == null || customArray.getLength() == 0) {
            return false;
        }
        int[] tempArr = customArray.getArray();
        int max = tempArr[0];
        for (int el : tempArr) {
            if (el > max) {
                max = el;
            }
        }
        return max == target;
    }
}
