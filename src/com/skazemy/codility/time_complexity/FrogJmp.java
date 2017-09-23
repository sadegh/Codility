package com.skazemy.codility.time_complexity;

public class FrogJmp {

    public int solution(int x, int y, int jumpDistance) {
        int distance = y - x;
        if (distance % jumpDistance == 0) {
            return distance / jumpDistance;
        } else {
            return (distance / jumpDistance) + 1;
        }
    }
}
