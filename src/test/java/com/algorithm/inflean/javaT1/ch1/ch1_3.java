package com.algorithm.inflean.javaT1.ch1;

import java.util.Scanner;

public class ch1_3 {

    public static String solution(String str) {
        String answer = null;
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static String solution2(String str) {
        String answer = null;
        // pos는 문장 안에서 단어와 단어 사이에 존재하는
        // 공백 문자의 인덱스 위치를 저장하기 위한 변수
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            // pos+1 = pos +1(=공백) 뒤 부터 끝까지 substring
            str = str.substring(pos + 1);
        }

        // 마지막 단어는 뒤에 공백이 없으므로
        if (str.length() > m)
            answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(mySolution(str));
        // System.out.println(solution(str));
    }

    public static String mySolution(String str) {
        String answer = null;
        String[] strArray = str.split(" ");
        answer = strArray[0];
        for (String getStr : strArray) {
            if (getStr.length() > answer.length()) answer = getStr;
        }
        return answer;
    }

}
