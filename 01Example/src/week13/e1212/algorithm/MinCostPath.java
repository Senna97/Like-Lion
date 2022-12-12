package week13.e1212.algorithm;

import java.util.Arrays;

public class MinCostPath {

    public void getMinCostPath(int[][] arr) {
        int[][] dp = new int[arr.length][arr[1].length];
        System.out.println(Arrays.deepToString(dp));
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 3, 2},
                {4, 6, 2},
                {1, 2, 4},
        };

        System.out.println(Arrays.deepToString(arr));

        MinCostPath minCostPath = new MinCostPath();
        minCostPath.getMinCostPath(arr);
    }
}
