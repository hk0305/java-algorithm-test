package com.algorithm.inflean.javaT1.ch1.fail;

import java.util.Scanner;

public class ch1_5 {

    public static String solution() {
        String answer = null;

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(mySolution(str));
    }

    // 모르겠음!!!
    public static String mySolution(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] chs = str.toCharArray();
        for (int k=0; k<chs.length; k++) {
            if (String.valueOf(chs[k]).matches("[^\uAC00-\uD7A30-9a-zA-Z]")) {
                strBuilder.append(chs[k]);
            } else {
                strBuilder.append(chs[(chs.length-1) - k]);
            }
        }
        return strBuilder.toString();
    }

}
