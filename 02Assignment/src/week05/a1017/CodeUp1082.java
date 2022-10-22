package week05.a1017;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toHexString;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = parseInt(str, 16);

        for (int i = 1; i < 16; i++) {
            String hexa = toHexString(i).toUpperCase();
            String multiple = toHexString(num * i).toUpperCase();
            System.out.printf("%s*%s=%s\n", str, hexa, multiple);
        }
    }
}
