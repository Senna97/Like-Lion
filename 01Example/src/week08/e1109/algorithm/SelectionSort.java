package week08.e1109.algorithm;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class SelectionSort {

    public void selectionSort(int[] arr, BiPredicate<Integer, Integer> bPd) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (bPd.test(arr[j], arr[swapIdx])) {
                    swapIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[swapIdx];
            arr[swapIdx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        selectionSort.selectionSort(arr, (a, b) -> a < b);// 오름차순 정렬
        selectionSort.selectionSort(arr, (a, b) -> a > b);// 내림차순 정렬
    }
}
