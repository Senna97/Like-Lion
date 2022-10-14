package week04.e1014.algorithm;

import java.util.Scanner;

public class CodeUp1443 {

    public int[] sort(int[] arr) {
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
        int num = sc.nextInt();

        int[] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            int element = sc.nextInt();
            numbers[i] = element;
        }

        CodeUp1443 codeUp1443 = new CodeUp1443();
        int[] sortedNumbers = codeUp1443.sort(numbers);

        for (int number : sortedNumbers) {
            System.out.println(number);
        }
    }
}

