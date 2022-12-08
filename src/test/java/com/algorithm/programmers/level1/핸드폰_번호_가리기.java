package com.algorithm.programmers.level1;

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        int totalLength = phone_number.length();
        String last4Str =  phone_number.substring(totalLength-4, totalLength);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<totalLength-4; i++) {
            sb.append("*");
        }
        return sb.toString() + last4Str;
    }

    /**
     * 풀이 참고
     * 
     * @param phone_number
     * @return
     */
    public String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

}
