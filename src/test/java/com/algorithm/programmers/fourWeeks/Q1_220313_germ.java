package com.algorithm.programmers.fourWeeks;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.util.StopWatch;

public class Q1_220313_germ {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch("4_Q1 Test");
        stopWatch.start("---------- T E S T ----------");

        try {
//            System.out.println(ArrayUtils.toString(solution(3, 4, 2, new int[][]{{3, 2}, {3, 2}, {2, 2}, {3, 2}, {1, 4}, {3, 2}, {2, 3}, {3, 1}})));
            System.out.println(ArrayUtils.toString(solution(3, 4, 2, new int[][]{{3, 2}, {3, 2}, {2, 2}, {3, 2}, {1, 4}, {3, 2}})));
        } catch (Exception e) {
            stopWatch.stop();
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    private static int[] xCoordinate = {0, 1, 0, -1};   // 0, 동, 0, 서
    private static int[] yCoordinate = {-1, 0, 1, 0};

    public static int[][] solution(int rows, int columns, int max_virus, int[][] queries) {
        int[][] answer = new int[rows][columns];

        for (int[] query : queries) {

            int level = answer[query[0] - 1][query[1] - 1];
            if (level < max_virus) {
                answer[query[0] - 1][query[1] - 1] = ++level;
                continue;
            }

            if (level == max_virus) {
                for (int n = 0; n < 4; n++) {
                    int xPoint = query[0] + xCoordinate[n];
                    int yPoint = query[1] + yCoordinate[n];
                    if (0 < xPoint && xPoint <= rows
                            && 0 < yPoint && yPoint <= columns) {

                        // 재귀 호출
                        if (answer[xPoint-1][yPoint-1] < max_virus) {
                            answer[xPoint-1][yPoint-1] = ++answer[xPoint-1][yPoint-1];
                            continue;
                        }

                        if (answer[xPoint-1][yPoint-1] == max_virus) {
                            for (int m = 0; m < 4; m++) {
                                int xPoint2 = xPoint-1 + xCoordinate[m];
                                int yPoint2 = yPoint-1 + yCoordinate[m];
                                System.out.println(xPoint2 + "," + yPoint2);
                                if (0 < xPoint2 && xPoint2 <= rows
                                        && 0 < yPoint2 && yPoint2 <= columns) {
                                    System.out.println(answer[xPoint2-1][yPoint2-1]);
                                    if (answer[xPoint2-1][yPoint2-1] < max_virus) {
                                        answer[xPoint2-1][yPoint2-1] = ++answer[xPoint2-1][yPoint2-1];
                                        continue;
                                    }
                                }
                            }

                        }

                    }
                }
            }

        }

        return answer;
    }
}
