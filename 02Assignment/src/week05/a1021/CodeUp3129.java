package week05.a1021;

import java.util.Scanner;
import java.util.Stack;

public class CodeUp3129 {

    public boolean getCorrectBracket(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        CodeUp3129 codeUp3129 = new CodeUp3129();

        boolean result = codeUp3129.getCorrectBracket(str);

        if (result) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}
