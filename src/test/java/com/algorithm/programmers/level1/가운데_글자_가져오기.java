package com.algorithm.programmers.level1;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    static String solution(String s) {
        int size = s.length();

        // 짝수
        if(size%2 == 0) {
            return s.substring(size/2-1, size/2+1);
        }
        // 홀수
        else {
            return "" + s.charAt((int) Math.ceil(size/2.0)-1);
        }
    }

}
