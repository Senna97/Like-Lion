package week08.e1108.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeUp3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        int findNum = sc.nextInt();
        if (nums.contains(findNum)) {
            System.out.println(nums.indexOf(findNum) + 1);
        } else {
            System.out.println(-1);
        }
    }
}
