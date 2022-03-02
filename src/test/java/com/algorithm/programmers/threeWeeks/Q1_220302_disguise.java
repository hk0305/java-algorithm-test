package com.algorithm.programmers.threeWeeks;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class Q1_220302_disguise {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("3_Q1 Test");
        stopWatch.start("---------- T E S T ----------");

        try {
            System.out.println(Arrays.toString(solution(new String[][]{{"09:10", "lee"}}, new String[][]{{"09:00", "kim"}, {"09:05", "bae"}})));
        } catch (Exception e) {
            stopWatch.stop();
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    public static String[] solution(String[][] booked, String[][] unbooked) {
        String[] answer = new String[0];
        return answer;
    }

}
