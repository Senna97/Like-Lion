package week10.e1123.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(1);
        fibonacciList.add(1);
        for (int i = 0; i < n - 2; i++) {
            fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i + 1));
        }
        System.out.println(fibonacciList);
        System.out.println(fibonacciList.get(n - 1));
    }
}