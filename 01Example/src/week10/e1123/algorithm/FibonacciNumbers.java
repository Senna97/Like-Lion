package week10.e1123.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbers {

    public int getFibonacciNum(int num) {
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(1);
        fibonacciList.add(1);
        for (int i = 0; i < num - 2; i++) {
            fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i + 1));
        }
        return fibonacciList.get(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        int answer = fibonacciNumbers.getFibonacciNum(n);
        System.out.println(answer);
    }
}