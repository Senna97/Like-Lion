package week04.a1013;

import java.util.Scanner;

public class CodeUp1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'A') {
            System.out.println("best!!!");
        } else if (ch == 'B') {
            System.out.println("good!!");
        } else if (ch == 'C') {
            System.out.println("run!");
        } else if (ch == 'D') {
            System.out.println("slowly~");
        } else {
            System.out.println("what?");
        }
    }
}
