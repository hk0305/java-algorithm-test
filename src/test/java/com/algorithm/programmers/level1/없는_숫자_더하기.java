package com.algorithm.programmers.level1;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
    }

    public static int solution(int[] numbers) {
        int total = 45;
        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }

        return total - sum;
    }

    /**
     * 다른 풀이 참고
     *
     * @param numbers
     * @return
     */
    public int solution2(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }

}
