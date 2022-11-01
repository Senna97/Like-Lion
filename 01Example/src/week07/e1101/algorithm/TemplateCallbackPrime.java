package week07.e1101.algorithm;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {

    boolean isPrime(int n, StatementStrategy stmt) {

        for (int i = 2; stmt.compare(i, n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean result = tcp.isPrime(17);
        System.out.println(result);
    }
}