package com.algorithm.programmers.highKit.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 전화번호_목록 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123", "456", "789"}));
    }

    static boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (String s : phone_book) {
            for (int k = 0; k < s.length(); k++) {
                if (map.containsKey(s.substring(0, k))) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean arraysSolution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        }

        return true;
    }

}
