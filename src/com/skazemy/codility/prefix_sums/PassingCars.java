package com.skazemy.codility.prefix_sums;

public class PassingCars {
    public int solution(int[] array) {
        int totalWesteners = 0;
        for (int item : array) {
            if (item == 1) totalWesteners++;
        }

        long passingCars = 0;
        int passedWesteners = 0;
        for (int item: array) {
            if (item == 1) {
                passedWesteners++;
            } else {
                passingCars += (totalWesteners - passedWesteners);
            }
        }

        if (passingCars > 1_000_000_000) return -1;
        else return (int) passingCars;
    }
}
