package com.skazemy.codility.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {
    @Test
    void solution() {
        CyclicRotation solution = new CyclicRotation();
        assertArrayEquals(new int[] {9, 7, 6, 3, 8}, solution.solution(new int[] {3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[] {}, solution.solution(new int[] {}, 3));
    }

}