package com.putkov.ft.reader;

import com.putkov.ft.exceptions.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DataDataReaderImpl implements DataReader {
    private static final Logger logger = LogManager.getLogger(DataDataReaderImpl.class);
    @Override
    public List<String> readArrays(Path filePath) throws CustomException, IOException {
        if (filePath == null) {
            throw new CustomException("File path is null");
        }
        logger.info("Reading arrays from file: {}", filePath);
        return Files.readAllLines(filePath);
    }
}