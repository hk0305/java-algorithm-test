package com.algorithm.programmers.practice.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        for (int i=0; i<s.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(s.charAt(s.length()-1-i)));
        }

        return answer;
    }
}
