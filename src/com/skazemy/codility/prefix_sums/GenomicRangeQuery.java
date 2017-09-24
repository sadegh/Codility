package com.skazemy.codility.prefix_sums;

public class GenomicRangeQuery {

    public int[] solution(String dnaSequence, int[] p, int[] q) {
        int[] aCounter = new int[dnaSequence.length() + 1];
        int[] cCounter = new int[dnaSequence.length() + 1];
        int[] gCounter = new int[dnaSequence.length() + 1];
        int[] tCounter = new int[dnaSequence.length() + 1];
        aCounter[0] = 0;
        cCounter[0] = 0;
        gCounter[0] = 0;
        tCounter[0] = 0;

        char[] dnaSeq = dnaSequence.toCharArray();

        for (int i = 0; i < dnaSeq.length; i++) {
            switch (dnaSeq[i]) {
                case 'A':
                    aCounter[i + 1] = aCounter[i] + 1;
                    cCounter[i + 1] = cCounter[i];
                    gCounter[i + 1] = gCounter[i];
                    tCounter[i + 1] = tCounter[i];
                    break;
                case 'C':
                    aCounter[i + 1] = aCounter[i];
                    cCounter[i + 1] = cCounter[i] + 1;
                    gCounter[i + 1] = gCounter[i];
                    tCounter[i + 1] = tCounter[i];
                    break;
                case 'G':
                    aCounter[i + 1] = aCounter[i];
                    cCounter[i + 1] = cCounter[i];
                    gCounter[i + 1] = gCounter[i] + 1;
                    tCounter[i + 1] = tCounter[i];
                    break;
                case 'T':
                    aCounter[i + 1] = aCounter[i];
                    cCounter[i + 1] = cCounter[i];
                    gCounter[i + 1] = gCounter[i];
                    tCounter[i + 1] = tCounter[i] + 1;
                    break;
                default:
                    throw new IllegalArgumentException("dna must only contains A,C,G,T, but is has a:  " + dnaSeq[i]);
            }
        }


        int[] result = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            int start = p[i];
            int end = q[i];

            if ((aCounter[end + 1] - aCounter[start]) > 0) result[i] = 1;
            else if ((cCounter[end + 1] - cCounter[start]) > 0) result[i] = 2;
            else if ((gCounter[end + 1] - gCounter[start]) > 0) result[i] = 3;
            else if ((tCounter[end + 1] - tCounter[start]) > 0) result[i] = 4;
            else throw new IllegalStateException("Bad state.");

        }
        return result;
    }
}
