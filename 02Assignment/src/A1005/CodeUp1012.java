package A1005;

import java.util.Scanner;

public class CodeUp1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.printf("%f", f); //float 형식으로 출력해야 1.54가 아닌 1.540000으로 출력된다.
    }
}
