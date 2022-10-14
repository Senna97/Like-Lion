package week04.e1014.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortRecursion {

    public int[] sort(int[] arr, int i) {

        if (i == arr.length) {
            return arr;
        }

        swap(arr, i);
        return sort(arr, i + 1);
    }

    public void swap(int[] arr, int i) {
        int temp;

        for (int j = i; j > 0; j--) {
            if (arr[j - 1] > arr[j]) {
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("삽입 정렬을 원하는 배열의 크기를 입력해주세요. >> ");
        int num = sc.nextInt();
        System.out.print("삽입 정렬할 배열을 입력해주세요. >> ");
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }

        InsertionSortRecursion insertionSortRecursion = new InsertionSortRecursion();
        int[] result = insertionSortRecursion.sort(arr, 1);
        System.out.print("삽입 정렬된 배열: ");
        System.out.println(Arrays.toString(result));
    }
}
