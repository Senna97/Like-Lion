package week04.e1014.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    int[] sort(int[] arr) {
        int temp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("삽입 정렬할 배열을 입력해주세요. (단, 크기는 5) >> ");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(arr);
        System.out.print("삽입 정렬된 배열: ");
        System.out.println(Arrays.toString(result));
    }
}
