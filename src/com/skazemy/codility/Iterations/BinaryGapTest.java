package com.skazemy.codility.Iterations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class BinaryGapTest {

    @Test
    public void solution() throws Exception {
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(0, binaryGap.solution(Integer.parseInt("10000", 2)));
        assertEquals(4, binaryGap.solution(Integer.parseInt("100001", 2)));
        assertEquals(3, binaryGap.solution(Integer.parseInt("100011111001101", 2)));
        assertEquals(4, binaryGap.solution(Integer.parseInt("1100001000000", 2)));

    }

}