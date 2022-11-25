package week10.e1125.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp2623 {

    public int getGCD(int a, int b) {

        if (a == b) {
            return a;
        } else if (a > b) {
            return getGCD(a - b, b);
        } else {
            return getGCD(a, b - a);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        CodeUp2623 codeUp2623 = new CodeUp2623();
        int gcd = codeUp2623.getGCD(a, b);
        System.out.println(gcd);
    }
}