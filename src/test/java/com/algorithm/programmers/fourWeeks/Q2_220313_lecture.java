package com.algorithm.programmers.fourWeeks;

import org.springframework.util.StopWatch;

import java.util.HashMap;
import java.util.Set;

public class Q2_220313_lecture {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("4_Q2 Test");
        stopWatch.start("---------- T E S T ----------");

        try {
            System.out.println(solution(new String[]{"yellowhat"}, new String[]{"yellowhat"}, "yellowhat"));
        } catch (Exception e) {
            stopWatch.stop();
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    public static String[] solution(String[] s1, String[] s2, String k) {
        String[] answer = {};
        return answer;
    }

}
