package week03.e1004;

import java.util.Scanner;

public class RefundTest {
    public static void main(String[] args) {

        System.out.print("잔돈이 얼마입니까? >> ");

        Scanner in = new Scanner(System.in);;
        int refund = in.nextInt();

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        System.out.printf("5만원권 %d장, 나머지: %d\n", refund / curr50000, refund % curr50000);
        refund = refund % curr50000;
        System.out.printf("1만원권 %d장, 나머지: %d\n", refund / curr10000, refund % curr10000);
        refund = refund % curr10000;
        System.out.printf("5천원권 %d장, 나머지: %d\n", refund / curr5000, refund % curr5000);
        refund = refund % curr5000;
        System.out.printf("1천원권 %d장, 나머지: %d\n", refund / curr1000, refund % curr1000);
        refund = refund % curr1000;
        System.out.printf("5백원 %d개, 나머지: %d\n", refund / curr500, refund % curr500);
        refund = refund % curr500;
        System.out.printf("1백원 %d개, 나머지: %d\n", refund / curr100, refund % curr100);
        refund = refund % curr100;
        System.out.printf("5십원 %d개, 나머지: %d\n", refund / curr50, refund % curr50);
        refund = refund % curr50;
        System.out.printf("1십원 %d개, 나머지: %d\n", refund / curr10, refund % curr10);

    }
}

