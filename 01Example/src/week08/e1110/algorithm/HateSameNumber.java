package week08.e1110.algorithm;

import java.util.Arrays;

public class HateSameNumber {

    public int[] solution(int[] arr) {
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        HateSameNumber hateSameNumber = new HateSameNumber();
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4,4,4,3,3};

        System.out.println(Arrays.toString(hateSameNumber.solution(arr1))); // [1,3,0,1]
        System.out.println(Arrays.toString(hateSameNumber.solution(arr2))); // [4, 3]
    }
}
