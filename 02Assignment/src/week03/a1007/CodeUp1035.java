package week03.a1007;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(str, 16);
        String str2 = Integer.toOctalString(num);
        System.out.println(str2);
    }
}
