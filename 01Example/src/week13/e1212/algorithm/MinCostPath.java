package week13.e1212.algorithm;

import java.util.Arrays;

public class MinCostPath {

    public int getMinCostPath(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = arr[0][0]; // [0][0]은 그대로
                } else if (i == 0) { // i만 0
                    dp[i][j] = dp[i][j - 1] + arr[i][j];
                } else if (j == 0) { // j만 0
                    dp[i][j] = dp[i - 1][j] + arr[i][j];
                } else {
                    // 총 3군데 -> 위 i - 1, 왼쪽 j - 1, 왼쪽 대각선 [i - 1][j - 1]
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + arr[i][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(dp));

        return dp[arr.length - 1][arr[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 2},
                {4, 6, 2},
                {1, 2, 4}
        };

        MinCostPath minCostPath = new MinCostPath();
        int answer = minCostPath.getMinCostPath(arr);
        System.out.println(answer);
    }
}
