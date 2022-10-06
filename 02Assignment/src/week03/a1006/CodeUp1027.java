package week03.a1006;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("\\.");
        System.out.printf("%s-%s-%s" ,arr[2],arr[1],arr[0]);
    }
}
