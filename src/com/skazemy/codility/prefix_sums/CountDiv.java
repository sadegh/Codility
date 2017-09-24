package com.skazemy.codility.prefix_sums;

public class CountDiv {

    public int solution(int a, int b, int k) {
        if (a == 0) return (b / k) + 1;

        return ((b / k)) - ((a - 1) / k) ;
    }
}
