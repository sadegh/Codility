package com.skazemy.codility.counting_elements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public int solution(int[] array) {
        Set<Integer> set = new HashSet<>(array.length);
        for (int item : array) {
            if (set.contains(item) || item > array.length || item < 1) return 0;
            set.add(item);
        }
        return 1;
    }
}
