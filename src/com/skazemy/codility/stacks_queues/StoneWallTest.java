package com.skazemy.codility.stacks_queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneWallTest {
    @Test
    void solution() {
        StoneWall solution = new StoneWall();
        assertEquals(7, solution.solution(new int[] {8, 8, 5, 7, 9, 8, 7, 4, 8}));
    }

}