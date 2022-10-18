package week05.a1018.algorithm;

import java.util.Scanner;

public class Rectangle {
    String letter = "*";

    public Rectangle() {

    }

    public Rectangle(String letter) {
        this.letter = letter;
    }

    public void printRectangle(int x, int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x * y 직사각형을 그립니다. >> ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Rectangle rectangle = new Rectangle("@");
        rectangle.printRectangle(x, y);
    }
}
