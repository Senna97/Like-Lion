package week11.e1128.algorithm;

public class RecursionAlphabet2 {

    public void printAlphabet(String prefix, int num) {
        if (prefix.length() > num - 1) {
            System.out.println(prefix);
            return;
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            printAlphabet(prefix + ch, num);
        }
    }

    public static void main(String[] args) {
        RecursionAlphabet2 recursionAlphabet2 = new RecursionAlphabet2();
        recursionAlphabet2.printAlphabet("", 2);
    }
}