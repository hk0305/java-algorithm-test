package com.algorithm.programmers.lecture.oneWeeks.solutions;

import org.springframework.util.StopWatch;

import java.util.stream.IntStream;

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

    /**
     * 이분법
     *
     * @param budgets
     * @param M
     * @return
     */
    public static int solution(int[] budgets, int M) {
        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0);

        int answer = 0;
        while (min <= max) {
            // 예산의 상한액
            // IntStream 가변변수로 사용하면 안되므로 final 사용
            final int mid = (max + min) / 2;

            // 아래와 같다
            int sum = IntStream.of(budgets).map(b -> Math.min(b, mid)).sum();
            /*  for (int b : budgets) {
                // 예산 상한액보다 예산값이 더 크면,
                // 예산이 남으므로 합계에 더해준다.
                if (b > mid) sum += mid;
                else sum += b;
            }*/

            if (sum <= M) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }

        return answer;
    }

}
