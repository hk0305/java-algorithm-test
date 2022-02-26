package com.algorithm.programmers.twoWeeks;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class Q1_220226_MidTest {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("Middle Test");
        stopWatch.start("---------- T E S T ----------");

        try {
//            System.out.println(Arrays.toString(solution(new String[][]{{"09:55", "hae"}, {"10:05", "jee"}}, new String[][]{{"10:04", "hee"}, {"14:07", "eom"}})));
            System.out.println(Arrays.toString(solution(new String[][]{{"09:10", "lee"}}, new String[][]{{"09:00", "kim"}, {"09:05", "bae"}})));
        } catch (Exception e) {
            stopWatch.stop();
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    public static String[] solution(String[][] booked, String[][] unbooked) {

        int initTime = 0;
        int bIdx = 0;
        int ubIdx = 0;
        int wCnt = 0;
        int totalIdx = booked.length + unbooked.length;
        String[] answer = new String[totalIdx];
        while (totalIdx > 0) {

            int bT = 1440;
            if (bIdx < booked.length) {
                String[] bTa = booked[bIdx][0].split(":");
                bT = Integer.parseInt(bTa[0]) * 60 + Integer.parseInt(bTa[1]);
            }

            int ubT = 1440;
            if (ubIdx < unbooked.length) {
                String[] ubTa = unbooked[ubIdx][0].split(":");
                ubT = Integer.parseInt(ubTa[0]) * 60 + Integer.parseInt(ubTa[1]);
            }

            if (bT < ubT || bT < initTime + 10) {
                answer[wCnt] = booked[bIdx][1];
                initTime = bT + 10;
                bIdx++;
            } else {
                answer[wCnt] = unbooked[ubIdx][1];
                initTime = ubT + 10;
                ubIdx++;
            }

            wCnt++;
            totalIdx--;
        }

        return answer;
    }

}
