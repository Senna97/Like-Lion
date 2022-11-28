package week11.e1128.algorithm;

public class RecursionAlphabet {

    public String printAlphabet(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return printAlphabet((char) ((char) ch - 1)) + ch;
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        RecursionAlphabet recursionAlphabet = new RecursionAlphabet();
        String answer = recursionAlphabet.printAlphabet('Z');
        System.out.println(answer);
    }
}
