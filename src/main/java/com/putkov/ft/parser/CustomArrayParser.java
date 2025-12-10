package com.putkov.ft.parser;

import com.putkov.ft.exceptions.CustomException;

public interface CustomArrayParser {
    int[] parse(String line) throws CustomException;
}
