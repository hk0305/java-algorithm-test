package com.algorithm.programmers.level2;

import java.util.Arrays;

public class 최솟값_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        System.out.println(solution(new int[]{1, 2}, new int[]{3, 4}));
    }

    private static int solution(int[] A, int[] B) {

        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[(A.length - 1) - i];
        }

        return answer;
    }

}
