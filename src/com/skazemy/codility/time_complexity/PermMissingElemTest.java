package com.skazemy.codility.time_complexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {
    @Test
    void solution() {
        PermMissingElem solution = new PermMissingElem();
        assertEquals(4, solution.solution(new int[] {2, 3, 1, 5}));
        assertEquals(1, solution.solution(new int[] {}));
    }

}