package com.algorithm.programmers.highKit.hash;

import java.util.HashMap;

public class 폰켓몬 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 4}));
    }

    static int solution(int[] nums) {
        int answer = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, num);
        }

        return Math.min(hm.size(), nums.length / 2);
    }

}
