package com.algorithm.programmers.oneWeeks.solutions;

public class One_Week_220216_baseStation {

    public static void main(String[] args) {
        System.out.println(solution(16, new int[]{9}, 2));
    }

    /**
     * @param n 아파트의 개수
     * @param stations 기지국 위치
     * @param w 전파 범위
     * @return
     *
     * 효율성
     * 1. 루프 개선
     * 2. 적절한 데이터 구조 사용 - 프리미티브 타입
     * 3. 불필요한 오브젝트 제거
     */
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;

        int stationIndex = 0;
        int position = 0;
        while (position <= n) {
            if (stationIndex < stations.length && stations[stationIndex] - w <= position) {
                position = stations[stationIndex] + w + 1;
                stationIndex += 1;
            } else {
                answer += 1;
                position += w * 2 + 1;
            }
        }

        return answer;
    }
}
