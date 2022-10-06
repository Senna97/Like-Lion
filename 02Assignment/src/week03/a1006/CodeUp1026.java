package week03.a1006;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(":");

        if (arr[1].charAt(0) == '0') { //여기서 0은 int 가 아니라 char 이므로 ''안에 넣어주어야 한다.
            System.out.println(arr[1].charAt(1));
        } else {
            System.out.println(arr[1]);
        }
    }
}
