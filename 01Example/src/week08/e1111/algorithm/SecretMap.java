package week08.e1111.algorithm;

import java.util.Arrays;

public class SecretMap {

    public int[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(Integer.toBinaryString(arr1[i]));
        }

        return arr1;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        SecretMap secretMap = new SecretMap();
        int[] solution = secretMap.solution(n, arr1, arr2);
        System.out.println(Arrays.toString(solution)); // ["#####","# # #", "### #", "# ##", "#####"]
    }
}
