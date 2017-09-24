package com.skazemy.codility.counting_elements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int solution(int[] array) {
        Set<Integer> set = new HashSet<>(array.length);
        for (int item: array) set.add(item);

        for (int i = 1; i < array.length + 2; i++) {
            if (!set.contains(i)) return i;
        }

        throw new IllegalStateException("Must never get in here!");
    }
}
