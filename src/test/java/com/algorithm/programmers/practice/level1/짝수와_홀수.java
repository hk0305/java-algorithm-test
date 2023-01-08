package com.algorithm.programmers.practice.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 짝수와_홀수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        String answer = "Even";

        if (number%2 == 0) {
            System.out.println(answer);
        } else {
            System.out.println("Odd");
        }

    }
}
