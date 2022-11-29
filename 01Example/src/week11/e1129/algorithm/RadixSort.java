package week11.e1129.algorithm;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] intArr = new int[]{7, 4, 5, 9, 1, 0};
        int[] emptyArr = new int[10];

        Arrays.fill(emptyArr, -1);

        for (int i = 0; i < intArr.length; i++) {
            emptyArr[intArr[i]] = intArr[i];
        }

        for (int num : emptyArr) {
            if (num != -1) {
                System.out.printf("%d ", num);
            }
        }
    }
}
