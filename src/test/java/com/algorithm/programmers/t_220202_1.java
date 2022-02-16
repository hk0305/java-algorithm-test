package com.algorithm.programmers;

import java.util.HashMap;

public class t_220202_1 {

    public static void main(String[] args) {
        String[] participant = {"1", "2", "3"};
        String[] completion = {"2", "3"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant)
            hm.put(player, hm.getOrDefault(player, 0) + 1);

        for (String player : completion)
            hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

}
