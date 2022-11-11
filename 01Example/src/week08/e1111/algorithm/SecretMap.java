package week08.e1111.algorithm;

import java.util.Arrays;

public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        String[][] arr = new String[n][n]; // 2차원 배열 생성
        String[] str1 = new String[n];
        String[] str2 = new String[n];

        for (int i = 0; i < n; i++) { // 10진수 -> 2진수 변환 & 자릿수 맞추기
            str1[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
            str2[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
        }

        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        SecretMap secretMap = new SecretMap();
        String[] solution = secretMap.solution(n, arr1, arr2);
        System.out.println(Arrays.toString(solution)); // ["#####","# # #", "### #", "# ##", "#####"]
    }
}
