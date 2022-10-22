package week05.a1018;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int white = sc.nextInt();
        int row, column;

        int[][] baduk = new int[19][19];
        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                baduk[i][j] = 0;
            }
        }

        for (int i = 0; i < white; i++) {
            row = sc.nextInt();
            column = sc.nextInt();
            for (int j = 0; j < baduk.length; j++) {
                for (int k = 0; k < baduk[j].length; k++) {
                    if (row == j + 1) {
                        if (column == k + 1) {
                            baduk[j][k] = 1;
                        }
                    }
                }
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