package week09.e1117.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int startIdx, int endIdx) {
        int bigger = partition(arr, startIdx, endIdx);

        if (startIdx < bigger - 1) {
            quickSort(arr, startIdx, bigger - 1);
        }

        if (bigger < endIdx) {
            quickSort(arr, bigger, endIdx);
        }
    }

    public int partition(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[(startIdx + endIdx) / 2];

        while (startIdx <= endIdx) {
            while (arr[startIdx] < pivot) {
                startIdx += 1;
            }

            while (arr[endIdx] > pivot) {
                endIdx -= 1;
            }

            if (startIdx <= endIdx) {
                swap(startIdx, endIdx, arr);
                startIdx += 1;
                endIdx -= 1;
            }
        }
        return startIdx;
    }

    public void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void printArr(int[] arr) {
        for (int i : arr) {
            System.out.printf("%s ", i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] sArr = str.split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr);
        quickSort.printArr(arr);
    }
}