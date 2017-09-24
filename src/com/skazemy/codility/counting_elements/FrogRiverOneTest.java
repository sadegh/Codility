package com.skazemy.codility.counting_elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {
    @Test
    void solution() {
        FrogRiverOne solution = new FrogRiverOne();
        assertEquals(6, solution.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));
        assertEquals(-1, solution.solution(5, new int[] {1, 3, 1, 4, 2, 3, 4}));
    }

}