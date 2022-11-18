package week09.e1118.algorithm;

import java.util.Arrays;

public class MatrixAddition {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[1].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MatrixAddition matrixAddition = new MatrixAddition();

        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};

        int[][] result = matrixAddition.solution(arr1, arr2);
        System.out.println(Arrays.deepToString(result)); // [[4,6],[7,9]]
    }
}
