package week09.e1115.algorithm;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {20, 18, 5, 19, 40, 50, 5, 25};
        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        // 기준값 뽑기
        int midIdx = nums.length / 2; // 4
        int pivot = nums[midIdx]; // 40
        mid.add(pivot);

        for (int num : nums) {
            if (num < pivot) {
                left.add(num);
            } else if (num > pivot) {
                right.add(num);
            }
        }

        System.out.println(left);
        System.out.println(mid);
        System.out.println(right);
    }
}
