package com.algorithm.programmers.oneWeeks;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class Q4_220219_numberGame {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("Onw_Week_220219_number");
        stopWatch.start("---------- T E S T ----------");

        try {
            System.out.println(solution(new int[]{7, 2, 1, 4}, new int[]{1, 2, 3, 5}) + "");
        } catch (Exception e) {
            stopWatch.stop();
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    public static int solution(int[] A, int[] B) {

        Arrays.sort(A);
        System.out.println(Arrays.toString(A));

        Arrays.sort(B);
        System.out.println(Arrays.toString(B));

        // [1, 2, 4, 7] -> [1, 2, 4, 7]
        // [1, 2, 3, 5] -> [2, 3, 5, 1]

        int winnerCnt = 0;
        int bCnt = 0;
        int aCnt = 0;
        for (int k=0; k<A.length; k++) {
            if (A[aCnt] >= B[bCnt]) {
                bCnt++;
            } else {
                aCnt++;
                bCnt++;
                winnerCnt++;
            }
        }

        return winnerCnt;
    }

}
