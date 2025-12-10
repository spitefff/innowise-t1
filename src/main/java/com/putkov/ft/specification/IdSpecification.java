package com.putkov.ft.specification;

import com.putkov.ft.entity.CustomArray;

public class IdSpecification implements Specification {
    private final long id;

    public IdSpecification(long id){
        this.id = id;
    }
    @Override
    public boolean specified(CustomArray customArray) {
        return customArray.getId()==id;
    }
}
