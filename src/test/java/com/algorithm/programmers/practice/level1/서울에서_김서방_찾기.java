package com.algorithm.programmers.practice.level1;

import java.util.Arrays;

public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }

    static String solution(String[] seoul) {
        int x = 0;
        for (int i=0; i <seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                x = i;
                break;
            }
        }
        return "김서방은 " + x + "에 있다";
    }

    /**
     * 다른 풀이 참고
     * @param seoul
     * @return
     */
    public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }
}
