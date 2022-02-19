package com.algorithm.programmers.mockExam;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class One_Week_220219_budget {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("Onw_Week_220219_budget");
        stopWatch.start("---------- T E S T ----------");

        try {
            System.out.println(solution(new int[]{150, 150, 200, 200, 150}, 1000) + "");
        } catch (Exception e) {
            stopWatch.stop();
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    public static int solution(int[] budgets, int M) {

        int sumBudgets = 0;
        for (int province : budgets) {
            sumBudgets += province;
        }

        if (sumBudgets < M){
            Arrays.sort(budgets);
            return budgets[budgets.length - 1];
        }

        int midM = M / budgets.length;
        int diffSum = 0;
        int maxProCnt = 0;
        for (int province : budgets) {
            int diff = midM - province;
            if (diff > 0) {
                diffSum += diff;
            } else {
                maxProCnt++;
            }
        }

        return diffSum / maxProCnt + midM;
    }

}
