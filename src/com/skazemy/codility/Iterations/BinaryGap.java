package com.skazemy.codility.Iterations;

public class BinaryGap {
    public int solution(int number) {
        int maxGap = 0;
        int n = number;

        while (n % 2 == 0 && n > 0) n = n / 2;

        while (n > 1) {
            int currentGap = 0;
            while (n % 2 == 0 && n > 0) {
                currentGap++;
                n = n / 2;
            }
            n = n / 2;
            maxGap = Math.max(currentGap, maxGap);
        }

        return maxGap;
    }
}
