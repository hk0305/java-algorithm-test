package com.algorithm.programmers.level2;

import java.util.ArrayList;

// TODO
public class JadenCase {

    public static void main(String[] args) {
        System.out.println(solution("3people  unFollowed me"));
        System.out.println(solution("123123 123 123 123 12312312 "));
    }

    static String solution(String s) {
        if (s == null || s == "") {
            return s;
        }
        String sl = s.toLowerCase();

        String word = "";
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < sl.length(); i++) {
            String splitWord = sl.substring(i, i + 1);
            if (!" ".equals(splitWord)) {
                word = word + splitWord;
                if (i == sl.length()-1) {
                    words.add(word);
                }
            } else if (!"".equals(word)) {
                words.add(word);
                word = "";
            }
        }

        String result = "";
        for (int i=0; i<words.size(); i++) {
            String tempWord = words.get(i);
            tempWord = tempWord.substring(0, 1).toUpperCase() + tempWord.substring(1);
            if (i == 0) {
                result = tempWord;
            } else {
                result = result + " " + tempWord;
            }

        }

        return result;
    }

}
