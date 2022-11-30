package week11.e1130.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1936 {

    public int getDistance(int a, int b) {

        if (a > b) {
            return getDistance(a / 2, b) + 1;
        } else if (a < b) {
            return getDistance(a, b / 2) + 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        CodeUp1936 codeUp1936 = new CodeUp1936();
        int distance = codeUp1936.getDistance(a, b);
        System.out.println(distance);
    }
}
