package com.putkov.ft.reader;

import com.putkov.ft.entity.CustomArr;
import com.putkov.ft.exceptions.CustomException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderImplTest {
    private  Reader reader;

    @BeforeEach
    void setUp() {
        reader = new ReaderImpl();
    }

    @AfterEach
    void tearDown() {
        reader = null;
    }

    @Test
    void testReadValidFile() throws IOException, CustomException {
        Path tempFile = Files.createTempFile("test", ".txt");
        Files.write(tempFile, List.of(" 1 2 3", "4 5 6"));
        List<CustomArr> arrs = reader.readArrays(tempFile);

        assertEquals (2, arrs.size());
        assertArrayEquals(new int[]{1, 2, 3}, arrs.get(0).getArray());
        assertArrayEquals(new int[]{4, 5, 6}, arrs.get(1).getArray());
    }

    @Test
    void testReadInvalidFile() throws IOException, CustomException {
        Path tempFile = Files.createTempFile("invalid_test", ".txt");
        Files.write(tempFile, List.of("dfs qwe"));

        try {
            reader.readArrays(tempFile);
            fail("CustomException was expected");
        } catch (CustomException e) {
        }
    }
}