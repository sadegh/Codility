package com.skazemy.codility.time_complexity;

public class TapeEquilibrium {

    public int solution(int[] array) {
        long total = 0;
        for (int element : array) total += element;

        long minDif = Long.MAX_VALUE;

        long sum = array[0];

        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            minDif = Math.min(minDif, Math.abs(total - (2 * sum)));
        }
        return (int) minDif;
    }
}
