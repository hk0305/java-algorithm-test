package com.algorithm.programmers.twoWeeks;

import org.springframework.util.StopWatch;

public class Q2_220226_MidTest {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("Middle Test");
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
        return 0;
    }

}
