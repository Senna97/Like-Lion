package week09.e1116.algorithm;

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] arr) {

    }

    public void swap(int a, int b) {
        int temp = 0;

        temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] nums = {20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = nums[nums.length / 2]; // nums[4] = 40
        int leftIdx = 0;
        int rightIdx = nums.length - 1;


        while (nums[leftIdx] < pivot) {
            if (nums[leftIdx] < pivot) {
                leftIdx += 1;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
