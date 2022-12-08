package week12.e1208.algorithm;

import java.util.Arrays;

public class FibonacciDP2 {

    public int getFibonacciDP(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 0);

        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        FibonacciDP2 fibonacciDP2 = new FibonacciDP2();
        int answer = fibonacciDP2.getFibonacciDP(6);
        System.out.println(answer);

    }
}
