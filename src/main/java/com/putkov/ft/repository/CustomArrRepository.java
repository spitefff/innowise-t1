package com.putkov.ft.repository;

import com.putkov.ft.entity.CustomArray;

import java.util.List;

public interface CustomArrRepository {
    void add(CustomArray array);
    void remove(CustomArray array);
    List<CustomArray> query(Specification specification);
}
