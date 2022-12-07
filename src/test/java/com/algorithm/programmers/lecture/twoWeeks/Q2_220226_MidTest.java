package com.algorithm.programmers.lecture.twoWeeks;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class Q2_220226_MidTest {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("Middle Test");
        stopWatch.start("---------- T E S T ----------");

        try {
            System.out.println(solution(new int[]{1, 2, 3}, new int[]{5, 5, 10}) + "");
        } catch (Exception e) {
            stopWatch.stop();
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    public static int solution(int[] people, int[] tshirts) {
        Arrays.sort(people);
        Arrays.sort(tshirts);

        int answer = 0;
        for (int k=0; k<people.length; k++) {
            for (int n=0; n<tshirts.length; n++) {
                if (people[k] <= tshirts[n]) {
                    people[k] = 0;
                    tshirts[n] = 0;
                    answer++;
                }
            }
        }

        return answer;
    }

}
