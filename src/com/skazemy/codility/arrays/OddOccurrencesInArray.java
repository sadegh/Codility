package com.skazemy.codility.arrays;

public class OddOccurrencesInArray {

    public int solution(int[] array) {
        int result = 0;
        for (int item : array) {
            result = result ^ item;
        }
        return result;
    }
}
