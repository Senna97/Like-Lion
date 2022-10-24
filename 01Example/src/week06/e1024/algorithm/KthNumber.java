package week06.e1024.algorithm;

import java.util.Arrays;
import java.util.Scanner;

// 프로그래머스: K번째수
public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[index++] = temp[commands[i][2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[][] commands = new int[num2][3];
        for (int i = 0; i < commands.length; i++) {
            for (int j = 0; j < 3; j++) {
                commands[i][j] = sc.nextInt();
            }
        }

        KthNumber kthNumber = new KthNumber();
        int[] result = kthNumber.solution(array, commands);

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", result[i]);
        }
    }
}
