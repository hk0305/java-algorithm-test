package com.algorithm.programmers.level1;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기_버블정렬 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {

        int arr[] = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i=0; i<s.length(); i++) {
            for (int k=1; k<s.length(); k++) {
                if (arr[i] < arr[k]) {
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        return null;
    }

}
