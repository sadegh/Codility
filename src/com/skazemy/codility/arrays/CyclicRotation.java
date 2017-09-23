package com.skazemy.codility.arrays;

public class CyclicRotation {

    public int[] solution(int[] array, int k) {
        int size = array.length;
        if (size == 0) return array;
        k = k % size;
        if (k == 0) return array;

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[(i + k) % size] = array[i];
        }

        return result;
    }
}
