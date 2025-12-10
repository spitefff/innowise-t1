package com.putkov.ft.factory;

import com.putkov.ft.entity.CustomArray;
import com.putkov.ft.exceptions.CustomException;

public interface CustomArrayFactory {
    CustomArray create(long id, int[] array) throws CustomException;
}
