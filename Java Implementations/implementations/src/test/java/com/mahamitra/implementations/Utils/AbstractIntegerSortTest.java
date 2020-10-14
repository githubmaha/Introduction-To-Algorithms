package com.mahamitra.implementations.Utils;

import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractIntegerSortTest {
    protected int[]  unSortedArray;

    @BeforeEach
    public void before() {
        unSortedArray = new int[] {5, 2, 4, 6, 1, 3};
    }
}
