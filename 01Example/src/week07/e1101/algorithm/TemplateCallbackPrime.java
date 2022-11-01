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
        boolean result = tcp.isPrime(17, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a * a <= b;
            }
        });
        System.out.println(result);

        System.out.println(tcp.isPrime(13, (a, b) -> a < b));
        System.out.println(tcp.isPrime(17, (a, b) -> a < b / 2));
        System.out.println(tcp.isPrime(19, (a, b) -> a * a <= b));
    }
}