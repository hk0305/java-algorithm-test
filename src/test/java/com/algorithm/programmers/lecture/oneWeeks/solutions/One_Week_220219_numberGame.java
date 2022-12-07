package com.algorithm.programmers.lecture.oneWeeks.solutions;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class One_Week_220219_numberGame {

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
        Arrays.sort(B);
        int index = B.length - 1;

        int answer = 0;
        for (int k = A.length - 1; k >= 0; k--) {
            if (A[k] < B[index]) {
                index--;
                answer++;
            }
        }

        return answer;
    }

}
