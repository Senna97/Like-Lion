package week05.e1017.algorithm;

import java.util.Scanner;

public class Pyramid {

    private String letter = "*";

    public Pyramid() {
    }

    public Pyramid(String letter) {
        this.letter = letter;
    }

    public void getPyramid(int num) {

        for (int i = 0; i < num; i++) {

            for (int j = 1; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(this.letter);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 줄의 피라미드를 출력하고 싶으신가요? >> ");
        int num = sc.nextInt();

        Pyramid pyramid = new Pyramid("@");
        pyramid.getPyramid(num);
    }
}
