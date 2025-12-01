package com.putkov.ft.reader;

import com.putkov.ft.entity.CustomArr;
import com.putkov.ft.exceptions.CustomException;
import com.putkov.ft.factory.CustomArrFactory;
import com.putkov.ft.factory.CustomArrFactoryImpl;
import com.putkov.ft.parser.CustomArrParser;
import com.putkov.ft.parser.CustomArrParserImpl;
import com.putkov.ft.validator.CustomArrValidatorImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReaderImpl implements  Reader{
    private final CustomArrFactoryImpl factory = new CustomArrFactoryImpl();
    private final CustomArrParserImpl parser = new CustomArrParserImpl();
    private final CustomArrValidatorImpl validator = new CustomArrValidatorImpl();

    @Override
    public List<CustomArr> readArrays(Path filePath) throws CustomException, IOException {
        List<CustomArr> arrays = new ArrayList<>();
        List<String> lines = Files.readAllLines(filePath);

        long idCounter = 1;
        for(String line : lines){
            if(validator.isValid(line)){
                int[] arr = parser.parse(line);
                arrays.add(factory.create(idCounter++, arr));
            } else {
                throw new CustomException("Invalid line "+ line);
            }
        }
        return arrays;
    }
}
