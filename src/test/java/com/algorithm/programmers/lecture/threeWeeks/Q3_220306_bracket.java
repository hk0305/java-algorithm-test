package com.algorithm.programmers.lecture.threeWeeks;

import java.util.Stack;

public class Q3_220306_bracket {

    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    private static class Bracket {
        int open;
        int close;
        Bracket (int open, int close) {
            this.open = open;
            this.close = close;
        }
    }

    public static int solution(int n) {
        Stack<Bracket> stack = new Stack<>();
        stack.push(new Bracket(0, 0));
        int answer = 0;
        while (!stack.isEmpty()) {
            Bracket bracket = stack.pop();
            if (bracket.open > n) continue;
            if (bracket.open < bracket.close) continue;
            if (bracket.open + bracket.close == 2*n) {
                answer++;
                continue;
            }
            stack.push(new Bracket(bracket.open + 1, bracket.close));
            stack.push(new Bracket(bracket.open, bracket.close + 1));
        }
        return answer;
    }

}
