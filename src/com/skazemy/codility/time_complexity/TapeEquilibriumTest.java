package com.skazemy.codility.time_complexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {
    @Test
    void solution() {
        TapeEquilibrium solution = new TapeEquilibrium();
        assertEquals(1, solution.solution(new int[] {3, 1, 2, 4, 3}));
    }

}