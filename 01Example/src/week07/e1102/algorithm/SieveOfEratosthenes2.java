package week07.e1102.algorithm;

import java.util.Scanner;

public class SieveOfEratosthenes2 {

    public int solution(int n) {
        int[] nums = new int[n - 1];
        boolean[] checks = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
            checks[i] = true;
        }

        int multipleOf = 2;
        for (int i = 2; i < nums.length; i += multipleOf) {
            checks[i] = false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (checks[i]) {
                System.out.printf("%d ", nums[i]);
            }
        }

        int count = 0;
        for (boolean check : checks) {
            if (check) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환합니다. 숫자 n 입력 >> ");
        int n = sc.nextInt();

        SieveOfEratosthenes2 sieveOfEratosthenes2 = new SieveOfEratosthenes2();
        int count = sieveOfEratosthenes2.solution(n);
        System.out.println("\n" + count);
    }
}