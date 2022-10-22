package week05.a1018;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] baduk = new int[19][19];

        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                baduk[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt(); // 십자 뒤집기 횟수
        int row, column;

        for (int i = 0; i < n; i++) {
            row = sc.nextInt() - 1;
            column = sc.nextInt() - 1;

            for (int j = 0; j < baduk.length; j++) {
                baduk[row][j] = baduk[row][j] == 1 ? 0 : 1;
            }

            for (int j = 0; j < baduk.length; j++) {
                baduk[j][column] = baduk[j][column] == 1 ? 0 : 1;
            }
        }

        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                System.out.printf("%d ", baduk[i][j]);
            }
            System.out.println();
        }
    }
}
