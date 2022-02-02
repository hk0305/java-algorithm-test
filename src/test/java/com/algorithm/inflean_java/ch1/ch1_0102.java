package com.algorithm.inflean_java.ch1;

import java.util.Scanner;

public class ch1_0102 {

    public static String solution(String str) {
        String answer = null;
        for (char c :  str.toCharArray()) {
            if (Character.isLowerCase(c))
                answer += Character.toUpperCase(c);
            else
                answer += Character.toLowerCase(c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
//        System.out.println(mySolution(str));
        System.out.println(solution(str));
    }

    public static String mySolution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c :  str.toCharArray()) {
            if ( 65 <= (int) c && (int) c <= 90) {
                stringBuilder.append(Character.toString(c).toLowerCase());
            } else {
                stringBuilder.append(Character.toString(c).toUpperCase());
            }
        }
        return stringBuilder.toString();
    }

}
