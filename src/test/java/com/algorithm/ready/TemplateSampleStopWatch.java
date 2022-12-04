package com.algorithm.ready;

import org.springframework.util.StopWatch;

public class TemplateSampleStopWatch {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("Start Test");
        stopWatch.start("---------- T E S T ----------");

        try {
            System.out.println(solution());
        } catch (Exception e) {
            stopWatch.stop();
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    public static String[] solution() {
        String[] answer = {};
        return answer;
    }

}
