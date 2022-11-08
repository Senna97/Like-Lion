package week08.e1108.algorithm;

import java.util.Scanner;

public class CodeUp2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int startIdx = 0;
        int endIdx = nums.length - 1;

        while (startIdx <= endIdx) {
            // 중간값 찾기
            int midIdx = (startIdx + endIdx) / 2;
            int midValue = nums[midIdx];

            // 인덱스(시작점, 끝점) 옮기기
            if (s > midValue) {
                startIdx = midIdx + 1;
            } else if (s < midValue) {
                endIdx = midIdx - 1;
            } else {
                // 같은지 비교하기
                System.out.println(midIdx + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}
