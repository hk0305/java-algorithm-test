package com.algorithm.programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수의_합 {
    // 에라토스테네스의 체를 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int answer = 0;
        if(n == 1) {
            answer = 1;
        } else {
            for (int i=1; i<=Math.sqrt(n); i++) {
                if (n%i == 0) {
                    if (n/i == i) {
                        answer = answer + i;
                    } else {
                        answer = answer + (i + (n/i));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
