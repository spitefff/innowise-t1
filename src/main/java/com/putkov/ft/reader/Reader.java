package com.putkov.ft.reader;

import com.putkov.ft.entity.CustomArr;
import com.putkov.ft.exceptions.CustomException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface Reader {
    List<CustomArr> readArrays(Path filePath) throws CustomException, IOException;
}
