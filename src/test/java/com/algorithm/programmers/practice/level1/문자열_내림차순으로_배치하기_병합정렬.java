package com.algorithm.programmers.practice.level1;

public class 문자열_내림차순으로_배치하기_병합정렬 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
        int arr[] = new int[s.length()];

        for (int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        sort(arr, 0, s.length());

        return parseIntArrToCharArr(arr);
    }

    public static void sort(int[] arr, int low, int high) {
        if (high - low < 2) {
            return;
        }

        int mid = (high + low) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, high);
        merge(arr, low, mid, high);
    }

    private static String parseIntArrToCharArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            sb.append((char) arr[arr.length-i-1]);
        }

        return sb.toString();
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int temp[] = new int[high-low];
        int index = 0;
        int l = low;
        int h = mid;

        while (l < mid && h < high) {
            if (arr[l]<arr[h]) {
                temp[index++] = arr[l++];
            } else {
                temp[index++] = arr[h++];
            }
        }

        while (l<mid) {
            temp[index++] = arr[l++];
        }

        while (h<high) {
            temp[index++] = arr[h++];
        }

        for (int i=low; i<high; i++) {
            arr[i] = temp[i - low];
        }
    }

}
