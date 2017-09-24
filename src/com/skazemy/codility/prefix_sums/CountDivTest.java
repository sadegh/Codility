package com.skazemy.codility.prefix_sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {
    @Test
    void solution() {
        CountDiv solution = new CountDiv();
        assertEquals(3, solution.solution(6, 11, 2));
        assertEquals(3, solution.solution(0, 11, 5));
    }

}