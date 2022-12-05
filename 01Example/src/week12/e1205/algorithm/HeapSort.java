package week12.e1205.algorithm;

import java.util.Arrays;

public class HeapSort {

    public int[] getMaxHeap(int[] arr, int length) {
        int[] maxHeap = new int[arr.length];

        for (int i = (length - 1) / 2; i >= 0; i--) {
            maxHeap = heapify(arr, length, i);
        }

        return maxHeap;
    }

    public int[] heapify(int[] arr, int length, int index) {
        int maxIndex = index;
        int leftIndex = index * 2 + 1;
        int rightIndex = index * 2 + 2;

        if (leftIndex < length && arr[leftIndex] > arr[maxIndex]) {
            maxIndex = leftIndex;
        }

        if (rightIndex < length && arr[rightIndex] > arr[maxIndex]) {
            maxIndex = rightIndex;
        }

        if (maxIndex != index) {
            swap(arr, index, maxIndex);
            heapify(arr, arr.length, maxIndex);
        }

        return arr;
    }

    public int[] swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};

        HeapSort heapSort = new HeapSort();
        int[] maxHeap = heapSort.getMaxHeap(arr, arr.length);
        System.out.println(Arrays.toString(maxHeap));
    }
}
