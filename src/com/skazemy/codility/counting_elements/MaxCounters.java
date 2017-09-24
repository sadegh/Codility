package com.skazemy.codility.counting_elements;

public class MaxCounters {

    public int[] solution(int n, int[] array) {
        int[] counters = new int[n];
        for (int i = 0; i < n; i++) {
            counters[i] = 0;
        }

        int maxCounter = 0;
        int lastRequestedMaxCounter = 0;

        for (int item : array) {
            if (0 < item && item < n + 1) {
                counters[item - 1] = Math.max(lastRequestedMaxCounter, counters[item - 1]) + 1;
                maxCounter = Math.max(maxCounter, counters[item - 1]);
            } else if (item == n + 1) {
                lastRequestedMaxCounter = maxCounter;
            } else {
                throw new IllegalArgumentException("array contains wrong value, " + item);
            }
        }

        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], lastRequestedMaxCounter);
        }

        return counters;
    }
}
