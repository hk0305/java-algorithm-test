package com.algorithm.programmers.practice.level2;

// TODO
public class 올바른_괄호 {

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
        System.out.println(solution("())()(()")); // TO-BE FALSE
    }

    private static boolean solution(String s) {
        if (s == null || s == "" || s.length() % 2 != 0) {
            return false;
        }

        String lastClose = s.substring(s.length() - 1, s.length());
        if (!"(".equals(s.substring(0, 1))
                || ")".equals(s.substring(0, 1))
                || !")".equals(lastClose)
                || "(".equals(lastClose)
        ) {
            return false;
        }

        int leftCnt = 0;
        int rightCnt = 0;
        String[] sArr = s.split("");
        for (int i = 0; i < sArr.length; i++) {
            if ("(".equals(sArr[i])) {
                leftCnt++;
            }
            if (")".equals(sArr[i])) {
                rightCnt++;
            }
        }

        if (leftCnt != rightCnt) {
            return false;
        }

        return true;
    }

}
