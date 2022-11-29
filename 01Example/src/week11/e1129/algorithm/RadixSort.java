package week11.e1129.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    public int getRemainder(int num, int count) {
        if (num >= 10) {
            return getRemainder(num / 10, count += 1);
        } else {
            return count;
        }
    }

    public int getHighestDigit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRemainder(arr[i], 1);
        }

        int max = 0;
        for (int num : arr) {
            max = Math.max(0, num);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] intArr = new int[]{7, 4, 5, 9, 1, 0};
        int[] emptyArr = new int[10];
        List<Integer> answer = new ArrayList<>();

        Arrays.fill(emptyArr, -1);

        for (int num : intArr) {
            emptyArr[num] = num;
        }

        for (int num : emptyArr) {
            if (num != -1) {
                answer.add(num);
            }
        }

        System.out.println(answer);

        int[] intArr2 = new int[]{71, 4, 125, 12395, 1234, 123450};
        RadixSort radixSort = new RadixSort();
        int highestDigit = radixSort.getHighestDigit(intArr2);
        System.out.println(highestDigit);
    }
}