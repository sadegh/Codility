package com.skazemy.codility.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] array) {
        Set<Integer> set = new HashSet<>();
        for(int item : array) set.add(item);

        return set.size();
    }
}
