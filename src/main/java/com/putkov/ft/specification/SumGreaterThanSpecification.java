package com.putkov.ft.specification;

import com.putkov.ft.entity.CustomArray;
import com.putkov.ft.exceptions.CustomException;
import com.putkov.ft.service.CustomArrayServiceImpl;

public class SumGreaterThanSpecification implements Specification{
    private final int threshold;
    private final CustomArrayServiceImpl service = new CustomArrayServiceImpl();

    public SumGreaterThanSpecification(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean specified(CustomArray customArray) {
        try {
            return service.sumElements(customArray) > threshold;
        } catch (CustomException e) {
            return false; }
    }
    }

