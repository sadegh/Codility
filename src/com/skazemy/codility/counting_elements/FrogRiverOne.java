package com.skazemy.codility.counting_elements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int x, int[] array) {
        if (array.length < x) return -1;

        Set<Integer> positionSet = new HashSet<>(x);
        for (int i = 0; i < array.length; i++) {
            positionSet.add(array[i]);
            if (positionSet.size() == x) return i;
        }

        return -1;
    }
}
