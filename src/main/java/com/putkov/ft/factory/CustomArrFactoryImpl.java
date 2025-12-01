package com.putkov.ft.factory;

import com.putkov.ft.entity.CustomArr;
import com.putkov.ft.exceptions.CustomException;

public class CustomArrFactoryImpl implements CustomArrFactory{

    @Override
    public CustomArr create(long id, int[] array) throws CustomException {
        if (id <= 0 || array == null || array.length == 0) {
            throw new CustomException("Array must not be null or empty");
        }
        return new CustomArr(id, array);
    }
}
