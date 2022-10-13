package week04.e1013.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    int[] sort(int[] arr) {
        int temp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("버블 정렬할 배열을 입력해주세요. (단, 크기는 5) >> ");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(arr);
        System.out.print("버블 정렬된 배열: ");
        System.out.println(Arrays.toString(result));
    }
}
