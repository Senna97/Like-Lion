package week08.e1111.algorithm;

import java.util.Arrays;

public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];

        for (int i = 0; i < n; i++) { // 10진수 -> 2진수 변환 & 자릿수 맞추기
            sArr1[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
            sArr2[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
        }

        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));

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