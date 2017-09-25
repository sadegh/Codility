package com.skazemy.codility.prefix_sums;

public class MinAvgTwoSlice {

    public int solution(int[] array) {

        int minAvgIndex = 0;
        float minAvg = Float.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            float avg1 = (array[i] + array[i + 1]) / 2.0F;
            if (avg1 < minAvg) {
                minAvg = avg1;
                minAvgIndex = i;
            }

            if (i < array.length - 2) {
                float avg2 = (array[i] + array[i + 1] + array[i + 2]) / 3.0F;
                if (avg2 < minAvg) {
                    minAvg = avg2;
                    minAvgIndex = i;
                }
            }
        }

        return minAvgIndex;
    }
}
