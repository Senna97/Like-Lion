package week05.e1018.algorithm;

import java.util.Scanner;

public class Square {
    String letter = "*";

    public Square() {
    }

    public Square(String letter) {
        this.letter = letter;
    }

    public void printSquare(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n * n 정사각형을 그립니다. >> ");
        int n = sc.nextInt();

        Square square = new Square("@");
        square.printSquare(n);
    }
}
