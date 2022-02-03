package com.algorithm.inflean.javaT1.ch1;

import java.util.Scanner;

public class ch1_1 {

    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 방법 1
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == t)  answer++;
        }

        // 방법 2
        for (char c : str.toCharArray()) {
            if (c == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(solution(str, c));
    }

    public static void mySolution() {
        Scanner in = new Scanner(System.in);
        String input1 = in.next().toLowerCase();
        String input2 = in.next().toLowerCase();
        int totalCnt = 0;
        for (int i=0; i<input1.length(); i++) {
            String word = input1.substring(i, i+1);
            if (word.equals(input2)) {
                totalCnt++;
            }
        }
        System.out.println(totalCnt);
    }

}
