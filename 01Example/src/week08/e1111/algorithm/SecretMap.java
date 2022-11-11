package week08.e1111.algorithm;

import java.util.Arrays;

public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
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
