package week09.e1117.algorithm;

import java.util.Arrays;

public class QuickSort {

    public int[] sort(int[] arr) {
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        while (leftIdx < rightIdx) {
            if (arr[leftIdx] < pivot) {
                leftIdx += 1;
            }

            if (arr[rightIdx] > pivot) {
                rightIdx -= 1;
            }

            if (arr[leftIdx] > arr[rightIdx]) {
                swap(leftIdx, rightIdx, arr);
                leftIdx += 1;
                rightIdx -= 1;
            }
        }

        return arr;
    }

    public void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        int[] sortArr = quickSort.sort(arr);
        System.out.println(Arrays.toString(sortArr));
    }
}