package week09.e1114.algorithm;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 50;
        int[] nums = new int[n - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }

        System.out.println(Arrays.toString(nums));
    }
}
