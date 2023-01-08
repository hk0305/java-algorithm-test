package com.algorithm.programmers.practice.level1;

import java.util.Arrays;

public class 평균_구하기_풀이 {

    public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        평균_구하기_풀이 getMean = new 평균_구하기_풀이();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }

}
