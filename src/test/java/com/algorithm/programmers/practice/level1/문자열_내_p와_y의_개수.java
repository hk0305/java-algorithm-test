package com.algorithm.programmers.practice.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(solution(st.nextToken()));
    }

    static boolean solution(String s) {
        if (s == null)
            return false;

        String lowerCase = s.toLowerCase();

        if (lowerCase.indexOf("p") == -1 && lowerCase.indexOf("y") == -1) {
            return true;
        }

        int cntP=0;
        int cntY=0;

        for (int i=0; i<s.length(); i++) {
            if ('p' == lowerCase.charAt(i))
                cntP++;
            if ('y' == lowerCase.charAt(i))
                cntY++;
        }

        return cntP == cntY;
    }

}
