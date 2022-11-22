package week10.e1122.algorithm;

public class RecursiveFunctionPractice {

    public void print1To100(int num) {
        System.out.println(num);
        print1To100(num);
    }

    public static void main(String[] args) {
        RecursiveFunctionPractice recursiveFunctionPractice = new RecursiveFunctionPractice();
        recursiveFunctionPractice.print1To100(1);
    }
}
