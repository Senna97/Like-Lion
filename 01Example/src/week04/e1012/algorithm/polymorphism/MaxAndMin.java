package week04.e1012.algorithm.polymorphism;

import java.util.Scanner;

public class MaxAndMin {

    private int getMaxOrMin(int[] arr, Compare compare) {
        int targetValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            boolean isSth = compare.doSth(arr[i], targetValue);

            if (isSth) {
                targetValue = arr[i];
            }
        }

        return targetValue;
    }

    public int max(int[] arr) {

        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSth(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr) {

        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSth(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        MaxAndMin maxAndMin = new MaxAndMin();

        int minValue = maxAndMin.min(arr);
        System.out.println(minValue);

        int maxValue = maxAndMin.max(arr);
        System.out.println(maxValue);
    }
}