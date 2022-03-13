package com.algorithm.programmers.threeWeeks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q2_220305_gameMap {

    private static int[][] wayMaps = null;
    private static int[][] noWayMaps = null;

    @BeforeAll
    static void setUp() {
        wayMaps = new int[][]{
                {1, 0, 1, 1, 1}
                , {1, 0, 1, 0, 1}
                , {1, 0, 1, 1, 1}
                , {1, 1, 1, 0, 1}
                , {0, 0, 0, 0, 1}};

        noWayMaps = new int[][]{
                {1, 0, 1, 1, 1}
                , {1, 0, 1, 0, 1}
                , {1, 0, 1, 1, 1}
                , {1, 1, 1, 0, 0}
                , {0, 0, 0, 0, 1}};
    }

    @DisplayName("갈 길이 없습니다.")
    @Test
    void canNotFindMapsWay() {
        assertEquals(solution(noWayMaps), -1);
    }

    @DisplayName("갈 길이 있습니다.")
    @Test
    void canFindMapsWay() {
        assertEquals(solution(wayMaps), 11);
    }

    private static int n, m;   // 지도의 가로, 세로 길이
    private static int[] xCoordinate = {0, 1, 0, -1};   // 0, 동, 0, 서
    private static int[] yCoordinate = {-1, 0, 1, 0};   // 북, 0, 남, 0
    private static boolean[][] isVisited;

    public int solution(int[][] maps) {

        n = maps.length;
        m = maps[0].length;
        isVisited = new boolean[n][m];

        return breadthFirstSearch(maps);
    }

    public class Node {
        int x;
        int y;
        int cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }

    public int breadthFirstSearch(int[][] maps) {

        Queue<Node> q = new LinkedList<>();
        // 시작점 0, 0과 현재 위치 1부터 세고 시작
        q.offer(new Node(0, 0, 1));
        isVisited[0][0] = true;

        /*wayMaps = new int[][]{
                {1, 0, 1, 1, 1}
                , {1, 0, 1, 0, 1}
                , {1, 0, 1, 1, 1}
                , {1, 1, 1, 0, 1}
                , {0, 0, 0, 0, 1}};*/

        while (!q.isEmpty()) {
            Node nowNode = q.poll();

            // 모든 경우를 확인한 경우 종료
            if (nowNode.x == (n - 1)
                    && nowNode.y == (m - 1)) {
                return nowNode.cost;
            }

            for (int k = 0; k < 4; k++) {
                int xPoint = nowNode.x + xCoordinate[k];
                int yPoint = nowNode.y + yCoordinate[k];

                if (0 <= xPoint && xPoint < n
                        && 0 <= yPoint && yPoint < m) {
                    if (maps[xPoint][yPoint] == 1 && !isVisited[xPoint][yPoint]) {
                        // 방문완료
                        isVisited[xPoint][yPoint] = true;
                        q.offer(new Node(xPoint, yPoint, nowNode.cost + 1));
                    }
                }
            }

        }

        return -1;
    }

}
