package com.putkov.ft.parser;

import com.putkov.ft.exceptions.CustomException;

public interface CustomArrParser {
    int[] parse(String line) throws CustomException;
}
