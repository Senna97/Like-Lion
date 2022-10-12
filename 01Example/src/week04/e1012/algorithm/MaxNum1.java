package week04.e1012.algorithm;

import java.util.Scanner;

public class MaxNum1 {

    void MaxNum(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        MaxNum1 maxNum1 = new MaxNum1();
        maxNum1.MaxNum(arr);
    }
}
