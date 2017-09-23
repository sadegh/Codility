package com.skazemy.codility.time_complexity;

public class PermMissingElem {

    public int solution(int[] array) {
        long sum = 0;
        for (int item : array) {
            sum += item;
        }
        long n = array.length;
        return (int) ((((n + 1) * (n + 2)) / 2) - sum);
    }
}
