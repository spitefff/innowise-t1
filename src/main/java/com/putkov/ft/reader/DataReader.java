package com.putkov.ft.reader;

import com.putkov.ft.exceptions.CustomException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface DataReader {
    List<String> readArrays(Path filePath) throws CustomException, IOException;
}
