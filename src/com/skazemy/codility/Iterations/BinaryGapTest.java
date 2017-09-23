package com.skazemy.codility.Iterations;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    @Test
    public void solution() throws Exception {
        BinaryGap.Solution solution = new BinaryGap.Solution();
        assertEquals(0, solution.solution(Integer.parseInt("10000", 2)));
        assertEquals(4, solution.solution(Integer.parseInt("100001", 2)));
        assertEquals(3, solution.solution(Integer.parseInt("100011111001101", 2)));
        assertEquals(4, solution.solution(Integer.parseInt("1100001000000", 2)));

    }

}