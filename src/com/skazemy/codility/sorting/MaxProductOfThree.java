package com.skazemy.codility.sorting;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] array) {
        Arrays.sort(array);
        int p1 = array[0] * array[1] * array[2];
        int p2 = array[0] * array[1] * array[array.length - 1];
        int p3 = array[array.length - 3] * array[array.length - 2] * array[array.length - 1];
        return Math.max(p1, Math.max(p2, p3));
    }
}
