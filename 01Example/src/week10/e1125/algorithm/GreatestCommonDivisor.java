package week10.e1125.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GreatestCommonDivisor {

    public int getGCD(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        int gcd = greatestCommonDivisor.getGCD(a, b);
        System.out.println(gcd);
    }
}