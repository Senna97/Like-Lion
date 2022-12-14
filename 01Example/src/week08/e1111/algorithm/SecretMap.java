package week08.e1111.algorithm;

import java.util.Arrays;

public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]).replace("1", "#").replace("0", " ");

            // 자릿수 맞춰주는 연산
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
        }

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