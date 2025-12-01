package com.putkov.ft.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArr {
    private final Logger logger = LogManager.getLogger();
        private long id;
        private final int[] array;

    public CustomArr(long id, int[] array) {
        this.id = id;
        this.array = array.clone();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int[] getArray() {
        return array.clone();
    }

    public int getLength(){
        return array.length;
    }

    public void setValue(int index, int value) {
        array[index] = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        CustomArr that = (CustomArr) o;
        return id == that.id && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(id);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArr{");
        sb.append("id=").append(id);
        sb.append(", array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}
