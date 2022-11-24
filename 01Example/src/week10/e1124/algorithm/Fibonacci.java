package week10.e1124.algorithm;

public class Fibonacci {

    public int getFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int r = fibonacci.getFibonacci(6);
        System.out.println(r);
    }
}