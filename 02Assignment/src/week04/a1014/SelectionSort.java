package week04.a1014;

import java.util.Scanner;

public class SelectionSort {

    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            arr = swap(i, getMinIndex(i, arr), arr);
        }
        return arr;
    }

    public int getMinIndex(int i, int[] arr) {
        int min = arr[i];
        int minIndex = 0;

        for (int j = i + 1; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
                minIndex = j;
            }
        }
        return minIndex;
    }

    public int[] swap(int i, int j, int[]arr) {
        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int[] numbers = new int[round];

        for (int i = 0; i < round; i++) {
            numbers[i] = sc.nextInt();
        }

        SelectionSort selectionSort = new SelectionSort();
        numbers = selectionSort.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
