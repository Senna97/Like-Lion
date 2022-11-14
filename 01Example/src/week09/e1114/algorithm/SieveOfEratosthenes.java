package week09.e1114.algorithm;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 50;
        int[] nums = new int[n - 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }

        //2 4 6 8 ...
        int idx = 0;
        for (int i = nums[idx] + 0; i < nums.length; i += 2) {
            nums[i] = 0;
        }

        //4 7 10 13 ...
        idx = 1;
        for (int i = nums[idx] + 1; i < nums.length; i += 3) {
            nums[i] = 0;
        }

        //6 10 14 18...
        idx = 2;
        for (int i = nums[idx] + 2; i < nums.length; i += 4) {
            nums[i] = 0;
        }

        //8 13 18 23...
        idx = 3;
        for (int i = nums[idx] + 3; i < nums.length; i += 5) {
            nums[i] = 0;
        }

        //10 16 22 28...
        idx = 4;
        for (int i = nums[idx] + 4; i < nums.length; i += 6) {
            nums[i] = 0;
        }

        //12 19 26 33...
        idx = 5;
        for (int i = nums[idx] + 5; i < nums.length; i += 7) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
