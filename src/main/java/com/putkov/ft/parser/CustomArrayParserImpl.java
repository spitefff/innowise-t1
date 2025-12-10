package com.putkov.ft.parser;

import com.putkov.ft.exceptions.CustomException;
import com.putkov.ft.factory.CustomArrayFactoryImpl;
import com.putkov.ft.validator.CustomArrayValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayParserImpl implements CustomArrayParser {
    private static final Logger logger = LogManager.getLogger(CustomArrayParserImpl.class);

    @Override
    public int[] parse(String line) throws CustomException {
        if(line == null || line.trim().isEmpty()){
            throw new CustomException("Line is empty");
        }
        logger.info("Parsing line: {}", line);

        String[] parts = line.trim().split("[\\s,;\\-]+");
        int[] result = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            try {
                result[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                logger.error("Invalid number format in line: {}", line, e);
                throw new CustomException("Invalid number format");
            }
        }
        return result;
}
}
