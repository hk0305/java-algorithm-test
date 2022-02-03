package com.algorithm.inflean.javaT1.ch1;

import java.util.Scanner;

public class ch1_4 {

    public static String solution() {
        String answer = null;

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        if (3 <= n && n <= 20) {
            String[] wordArray = new String[n];
            for (int i=0; i<n; i++) {
                wordArray[i] = kb.next();
            }

            if (wordArray != null && wordArray.length != 0) {
                String[] myAnswerArr = mySolution(wordArray);
                for (String answerStr : myAnswerArr) {
                    System.out.println(answerStr);
                }
            }

        } else {
            throw new RuntimeException("범위 값을 벗어납니다.");
        }

    }

    public static String[] mySolution(String[] strArr) {
        String[] answerArr = new String[strArr.length];

        for (int k=0; k<strArr.length; k++) {
            StringBuilder strBuilder = new StringBuilder();
            String str = strArr[k];
            char[] chs = str.toCharArray();
            for (int j=chs.length-1; j>-1; j--) {
                strBuilder.append(chs[j]);
            }

            answerArr[k] = strBuilder.toString();
        }

        return answerArr;
    }

}
