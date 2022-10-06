package week03.a1006;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //실수 1개를 String 으로 입력받아서
        String[] arr = str.split("\\."); //"."을 기준으로 나눈다.
        System.out.printf("%s\n%s", arr[0], arr[1]);
    }
}
