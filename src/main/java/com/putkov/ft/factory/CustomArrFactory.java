package com.putkov.ft.factory;

import com.putkov.ft.entity.CustomArr;
import com.putkov.ft.exceptions.CustomException;

public interface CustomArrFactory {
    CustomArr create(long id, int[] array) throws CustomException;
}
