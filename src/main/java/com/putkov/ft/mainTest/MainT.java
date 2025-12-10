package com.putkov.ft.mainTest;


import com.putkov.ft.entity.CustomArray;
import com.putkov.ft.exceptions.CustomException;
import com.putkov.ft.factory.CustomArrayFactoryImpl;
import com.putkov.ft.parser.CustomArrayParserImpl;
import com.putkov.ft.reader.DataDataReaderImpl;
import com.putkov.ft.validator.CustomArrayValidatorImpl;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class MainT {
    public static void main(String[] args) {
        DataDataReaderImpl reader = new DataDataReaderImpl();
        CustomArrayValidatorImpl validator = new CustomArrayValidatorImpl();
        CustomArrayParserImpl parser = new CustomArrayParserImpl();
        CustomArrayFactoryImpl factory = new CustomArrayFactoryImpl();

        try {
            Path path = Path.of("src/main/resources/arrays.txt");

            List<String> lines = reader.readArrays(path);
            long idCounter = 1;

            for(String line : lines){
                if(validator.isValid(line)){
                    int[] arr = parser.parse(line);
                    CustomArray customArray = factory.create(idCounter++, arr);
                } else {
                    System.err.println("Invalid line: " + line);
                }
            }
        } catch (IOException | CustomException e) {
            e.printStackTrace();
        }
    }
}