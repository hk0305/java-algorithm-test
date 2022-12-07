package com.algorithm.programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 자연수 N 초기화
 * String s 으로 변환
 *
 * new int[] arr = new int[s.length]
 * for (i=1; i<s.length; i++) {
 * 	arr[i] = s.split(i, 1);
 * }
 *
 * long sum;
 * for (i=1; i<arr.length; i++) {
 * 	sum = arr[i];
 * }
 *
 * sum 출력
 */
public class 자릿수_더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(solution(Integer.parseInt(st.nextToken())));
    }

    public static int solution(int n) {
        int answer = 0;

        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        for (int i=0; i<arr.length; i++) {
            answer = answer + arr[i];
        }

        return answer;
    }
}
