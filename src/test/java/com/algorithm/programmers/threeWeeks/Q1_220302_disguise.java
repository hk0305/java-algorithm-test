package com.algorithm.programmers.threeWeeks;

import org.springframework.util.StopWatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Q1_220302_disguise {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("3_Q1 Test");
        stopWatch.start("---------- T E S T ----------");

        try {
            System.out.println(solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}));
            System.out.println(solution(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}));
        } catch (Exception e) {
            stopWatch.stop();
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String[] clothe : clothes) {
            hashMap.put(clothe[1], hashMap.getOrDefault(clothe[1], 0) + 1);
        }

        Set<String> keySet = hashMap.keySet();
        for (String key : keySet)
            answer *= hashMap.get(key) + 1;

        return answer - 1;
    }

}
