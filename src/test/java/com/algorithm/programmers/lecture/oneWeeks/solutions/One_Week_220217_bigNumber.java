package com.algorithm.programmers.lecture.oneWeeks.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class One_Week_220217_bigNumber {

    public static Set<Long> setList = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2, 100, 20, 452, 123, 23}));
    }

    public static String solution(int[] numbers) {
        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2+s1).compareTo(s1+s2))
                .collect(Collectors.joining());

        if (answer.startsWith("0"))
            return "0";
        return answer;
    }

}
