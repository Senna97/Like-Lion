package week07.e1102.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SieveOfEratosthenes {

    void findPrime(int n) {
        List<Integer> list = new ArrayList<>(n - 1);
        for (int i = 0; i < n - 1; i++) {
            list.add(i + 2);
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) % i == 0 && list.get(j) != i) {
                    list.remove(j);
                }
            }
        }

        System.out.println(list);
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환합니다. 숫자 n 입력 >> ");
        int n = sc.nextInt();
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        sieveOfEratosthenes.findPrime(n);
    }
}
