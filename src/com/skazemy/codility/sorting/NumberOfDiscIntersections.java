package com.skazemy.codility.sorting;


import java.util.ArrayList;
import java.util.Collections;

public class NumberOfDiscIntersections {

    public int solution(int[] array) {
        final ArrayList<Pair> pairList = new ArrayList<>(array.length);

        for (long i = 0; i < array.length; i++) {
            final Pair pair = new Pair(i - array[(int) i], i + array[(int) i]);
            pairList.add(pair);
        }

        Collections.sort(pairList);
        int intersections = 0;

        for (int i = 0; i < pairList.size(); i++) {
            final Pair pair = pairList.get(i);
            int index = Collections.binarySearch(pairList, new Pair(pair.second, 0L));
            if (index < 0) {
                index = (index + 1) * -1;
                intersections += index - i - 1;
            } else {
                while (index < pairList.size() && pairList.get(index).first <= pair.second) index++;
                intersections += index - i - 1;
            }
        }

        return intersections > 10_000_000 ? -1 : intersections;
    }

    public static class Pair implements Comparable<Pair> {
        public final long first;
        public final long second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {
            if (first > o.first) return 1;
            else if (first == o.first) return 0;
            else return -1;
        }
    }
}
