package com.algorithm.programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수_제곱근_판별 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        double sqrt = Math.sqrt(n);

        if (sqrt == (int) sqrt)
            return (long) Math.pow(sqrt + 1, 2);
        else
            return -1;
    }

}
