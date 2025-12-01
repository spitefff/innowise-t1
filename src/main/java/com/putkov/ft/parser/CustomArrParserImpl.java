package com.putkov.ft.parser;

import com.putkov.ft.exceptions.CustomException;

public class CustomArrParserImpl implements CustomArrParser{
    @Override
    public int[] parse(String line) throws CustomException {
        if(line==null || line.trim().isEmpty()){
            throw new CustomException("CustomArr is null or empty");
        }
        String[] parts = line.trim().split("[\\s,;\\-]+");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
}
