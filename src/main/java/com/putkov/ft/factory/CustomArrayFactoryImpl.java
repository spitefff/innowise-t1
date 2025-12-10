package com.putkov.ft.factory;

import com.putkov.ft.entity.CustomArray;
import com.putkov.ft.exceptions.CustomException;
import com.putkov.ft.reader.DataDataReaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayFactoryImpl implements CustomArrayFactory {
    private static final Logger logger = LogManager.getLogger(CustomArrayFactoryImpl.class);

    @Override
    public CustomArray create(long id, int[] array) throws CustomException {
        if (id <= 0 || array == null || array.length == 0) {
            throw new CustomException("Array must not be null or empty");
        }
        logger.info("Created CustomArray with id={}", id);
        return new CustomArray(id, array);
    }
}
