package week11.e1202.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp4037 {

    public void factorization(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("%d ", i);
                factorization(num / i);
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CodeUp4037 codeUp4037 = new CodeUp4037();
        codeUp4037.factorization(n);
    }
}
