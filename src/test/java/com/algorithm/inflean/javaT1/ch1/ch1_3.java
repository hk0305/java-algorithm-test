package com.algorithm.inflean.javaT1.ch1;

import java.util.Scanner;

public class ch1_3 {

    public static String solution() {
        String answer = null;

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(mySolution(str));
    }

    public static String mySolution(String  str) {
        String answer = null;
        String[] strArray = str.split(" ");
        answer = strArray[0];
        for (String getStr : strArray) {
            if (getStr.length() > answer.length()) answer = getStr;
        }
        return answer;
    }

}
