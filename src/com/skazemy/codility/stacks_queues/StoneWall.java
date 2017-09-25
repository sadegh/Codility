package com.skazemy.codility.stacks_queues;

import java.util.Stack;

public class StoneWall {
    public int solution(int[] heights) {
        if (heights.length == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int blocks = 0;
        for (int i = 0; i < heights.length; i++) {
            int newHeight = heights[i];

            if (stack.isEmpty()) {
                stack.push(newHeight);
            }
            else {
                int last = stack.peek();
                if (last < newHeight) {
                    stack.push(newHeight);
                } else if (last > newHeight) {
                    stack.pop();
                    i--;
                    blocks++;
                } else {
                    System.out.println("equals");
                    // Do nothing, don't count
                }
            }

        }
        return stack.size() + blocks;
    }
}
