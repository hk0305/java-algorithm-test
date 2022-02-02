package com.algorithm.inflean_java.ch1;

import java.util.Scanner;

public class ch1_0102 {

    public static String solution(String str) {
        String answer = null;
        for (char c :  str.toCharArray()) {
            // 방법 1
            if (Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else if (Character.isUpperCase(c)) answer += Character.toLowerCase(c);
            else answer += Character.toString(c);

            // 방법2 - 아스키코드로 찾기
            if (c >= 65 && c <= 90) answer += Character.toLowerCase(c);
            else if (c >= 97 && c<= 122) answer += Character.toUpperCase(c);
            else answer += Character.toString(c);

            // 방법3 - 대소문자의 아스키코드는 32 차이가 난다.
            if (c >= 65 && c <= 90) answer += (char) (c + 32);
            else if (c >= 97 && c<= 122) answer += (char) (c - 32);
            else answer += Character.toString(c);
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
