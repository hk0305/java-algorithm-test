package com.algorithm.programmers.level1;

import java.io.IOException;

public class 평균_구하기 {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[4];
        for (int i=0; i<4; i++) {
            arr[i] = i + 1;
        }
        System.out.println(solution(arr));
    }


    public static double solution(int[] arr) {
        double answer = 0;
        int n = arr.length;
        double sum = 0;
        for (int i=0; i<n; i++) {
            sum = sum + arr[i];
        }

        answer = sum/n;
        return answer;
    }
}
