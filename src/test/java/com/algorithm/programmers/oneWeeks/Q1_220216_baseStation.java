package com.algorithm.programmers.oneWeeks;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;

public class Q1_220216_baseStation {

    public static void main(String[] args) {
        System.out.println(solution(16, new int[]{9}, 2));
    }

    public static int solution(int n, int[] stations, int w) {

        // 아파트 n개
        ArrayList<Integer> nArr = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            nArr.add(k + 1);
        }

        // stations 값을 계산, 4가 들어온 경우
        ArrayList<Integer> sRange = new ArrayList<>();
        for (int k = 0; k < stations.length; k++) {
            for (int t = 0; t < w + 1; t++) {
                if (!sRange.contains(stations[k] - t) && stations[k] - t > 0) {
                    sRange.add(stations[k] - t);
                }
                if (!sRange.contains(stations[k])) {
                    sRange.add(stations[k]);
                }
                if (!sRange.contains(stations[k] + t) && stations[k] + t < n) {
                    sRange.add(stations[k] + t);
                }
            }
        }

        nArr.removeAll(sRange);
        System.out.println(ArrayUtils.toString(nArr));

        int answer = 0;
        int wRange = 1 + (w * 2);
        int index = Math.round(w * 2 / 2);
        ArrayList<Integer> sRange2 = new ArrayList<>();
        for (int k = 0; k < nArr.size(); k++) {

            if (nArr.get(k) == index) {
                for (int t = 0; t < wRange; t++) {
                    sRange2.add(nArr.get(t));
                }
                nArr.removeAll(sRange2);
                answer++;
            }

            if (k > 0) {
                if ((nArr.get(k) - nArr.get(k - 1)) > wRange) {
                    sRange2.add(nArr.get(k - 1));
                    nArr.removeAll(sRange2);
                    answer++;
                }
            }

        }

        return answer;
    }

}
