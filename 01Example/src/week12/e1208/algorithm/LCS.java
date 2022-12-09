package week12.e1208.algorithm;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        int[][] arr = new int[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("str2: %s, str1: %s\n", str2.charAt(i), str1.charAt(j));
            }
        }
    }
}
