package com.skazemy.codility.time_complexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJmpTest {
    @Test
    void solution() {
        FrogJmp solution = new FrogJmp();
        assertEquals(3, solution.solution(10, 85, 30));
    }

}