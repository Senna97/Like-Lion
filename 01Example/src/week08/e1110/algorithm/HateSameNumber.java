package week08.e1110.algorithm;

import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {

    public List<Integer> solution(int[] arr) {

        int preNumIdx = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            } else if (arr[i] != arr[preNumIdx]) {
                list.add(arr[i]);
            }
            preNumIdx++;
        }
        return list;
    }

    public static void main(String[] args) {
        HateSameNumber hateSameNumber = new HateSameNumber();
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(hateSameNumber.solution(arr1)); // [1,3,0,1]
        System.out.println(hateSameNumber.solution(arr2)); // [4, 3]
    }
}
