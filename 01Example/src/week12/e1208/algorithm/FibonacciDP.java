package week12.e1208.algorithm;

import java.util.Arrays;

public class FibonacciDP {

    public int getFibonacciDP(int sequence) {
        int[] memo = new int[sequence + 1];
        Arrays.fill(memo, -1);

        if (memo[sequence] != -1) {
            return memo[sequence];
        }

        if (sequence <= 2) {
            memo[sequence] = 1;
        } else {
            memo[sequence] = getFibonacciDP(sequence - 1) + getFibonacciDP(sequence - 2);
        }

        return memo[sequence];
    }

    public static void main(String[] args) {
        FibonacciDP fibonacciDP = new FibonacciDP();
        int answer = fibonacciDP.getFibonacciDP(30);
        System.out.println(answer);
    }
}
