package week05.a1018;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[h][w];
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }

        int n = sc.nextInt(); // 놓을 수 있는 막대의 개수
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            if (d == 0) {
                for (int j = y; j < y + l; j++) {
                    arr[x][j] = 1;
                }
            } else {
                for (int j = x; j < x + l; j++) {
                    arr[j][y] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
