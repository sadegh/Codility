package com.skazemy.codility.counting_elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {
    @Test
    void solution() {
        PermCheck solution = new PermCheck();
        assertEquals(1, solution.solution(new int[] {3, 2, 4, 1}));
        assertEquals(0, solution.solution(new int[] {3, 2, 4}));
        assertEquals(0, solution.solution(new int[] {1, 1, 4, 4}));
    }

}