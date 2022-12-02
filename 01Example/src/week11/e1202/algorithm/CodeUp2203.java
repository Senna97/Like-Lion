package week11.e1202.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp2203 {

    public long findPrimeFactor(long num) {
        int i = 2;
        while (i <= num) {
            if (num % i == 0) {
                num /= i;
            } else {
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        CodeUp2203 codeUp2203 = new CodeUp2203();
        long answer = codeUp2203.findPrimeFactor(n);
        System.out.println(answer);
    }
}