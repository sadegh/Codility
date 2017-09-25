package com.skazemy.codility.prefix_sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTwoSliceTest {
    @Test
    void solution() {
        MinAvgTwoSlice solution = new MinAvgTwoSlice();
        assertEquals(1, solution.solution(new int[] {4, 2, 2, 5, 1, 5, 8}));
    }

}