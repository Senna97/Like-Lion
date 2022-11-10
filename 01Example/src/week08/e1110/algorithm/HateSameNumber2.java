package week08.e1110.algorithm;

import java.util.List;
import java.util.Stack;

public class HateSameNumber2 {

    public List<Integer> solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        for (int element : arr) {
            if (stack.isEmpty() || stack.peek() != element) {
                stack.push(element);
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        HateSameNumber2 hateSameNumber2 = new HateSameNumber2();
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(hateSameNumber2.solution(arr1)); // [1,3,0,1]
        System.out.println(hateSameNumber2.solution(arr2)); // [4, 3]
    }
}
