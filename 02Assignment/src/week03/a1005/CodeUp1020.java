package week03.a1005;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] id = sc.next().split("-");
        String birth = id[0];
        String code = id[1];
        System.out.println(birth + code);
    }
}