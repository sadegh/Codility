package com.skazemy.codility.time_complexity;

public class TapeEquilibrium {

    public int solution(int[] array) {
        long total = 0;
        for (int element : array) total += element;

        long sum = 0;
        long minDif = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];
            minDif = Math.min(minDif, Math.abs(total - (2 * sum)));
        }
        return (int) minDif;
    }
}
