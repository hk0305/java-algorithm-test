package com.algorithm.programmers.mockExam;

import java.util.*;

public class One_Week_220217 {

    public static Set<Long> setList = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2, 100, 20, 452, 123, 23}));
    }

    public static String solution(int[] numbers) {
        int cnt = numbers.length;
        playPermutations(numbers, new int[cnt], new boolean[cnt], 0, cnt);

        ArrayList<Long> arrayList = new ArrayList<>(setList);
        Collections.sort(arrayList, Comparator.reverseOrder());

        return arrayList.get(0)+"";
    }

    static void playPermutations(int[] intArr, int[] outputArr, boolean[] visited, int depth, int n) {

        if (depth == n) {
            StringBuilder strBuilder = new StringBuilder();
            for (int k = 0; k < n; k++) {
                strBuilder.append(outputArr[k]);
            }
            setList.add(Long.parseLong(strBuilder.toString()));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                outputArr[depth] = intArr[i];
                playPermutations(intArr, outputArr, visited, depth + 1, n);
                visited[i] = false;
            }

        }

    }

}
