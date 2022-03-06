package com.algorithm.programmers.threeWeeks;

public class Q4_220306_triangle {

    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{7}, {3, 8}, {8, 1, 0}}));
//        System.out.println(solution(new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }

    //       7
    //     3  8
    //    8  1  0
    //   2  7  4  4
    // 4  5  2  6  5
    public static int solution(int[][] triangle) {

        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        for (int k = 1; k < triangle.length; k++) {
            for (int h = 0; h < triangle[k].length; h++) {
                if (h == 0) {
                    dp[k][h] = dp[k - 1][0] + triangle[k][0];
                } else if (h == triangle[k].length - 1) {
                    dp[k][h] = dp[k - 1][h - 1] + triangle[k][h];
                } else {
                    // 핵심
                    System.out.println("Math.max(" + dp[k - 1][h - 1] + ", " + dp[k - 1][h] + ") + " + triangle[k][h]);
                    dp[k][h] = Math.max(dp[k - 1][h - 1], dp[k - 1][h]) + triangle[k][h];
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < triangle.length; i++) {
            answer = Math.max(answer, dp[triangle.length - 1][i]);
        }

        return answer;
    }

}
