package week04.e1012.algorithm;

import java.util.Scanner;

public class MaxNum2 {

    void getMax(int[][] arr) {
        int max = arr[0][0];
        int rowIndex = 0; // 행 인덱스
        int columnIndex = 0; // 열 인덱스

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    rowIndex = i + 1;
                    columnIndex = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(rowIndex + " " + columnIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        MaxNum2 maxNum2 = new MaxNum2();
        maxNum2.getMax(arr);
    }
}