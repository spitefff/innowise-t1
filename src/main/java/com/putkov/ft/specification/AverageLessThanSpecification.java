package com.putkov.ft.specification;

import com.putkov.ft.entity.CustomArray;

public class AverageLessThanSpecification implements Specification{
    private final double threshold;
    public AverageLessThanSpecification(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean specified(CustomArray customArray) {
        if (customArray == null || customArray.getArray() == null || customArray.getLength() == 0) {
            return false;
        }
        int sum=0;
        for(int el : customArray.getArray()){
            sum+=el;
        }
        double avg = (double) sum/ customArray.getLength();
        return avg < threshold;
    }
}
