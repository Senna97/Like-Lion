package week07.e1101.algorithm;

public class PrimeNumber {

    public int solution(int n) {
        int answer = 0;
        return answer;
    }

    boolean isPrime(int n) {
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag++;
            }
        }
        return flag == 0;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
//        int solution1 = primeNumber.solution(10);
//        System.out.println(solution1); // 2, 3, 5, 7 => 4
//        int solution2 = primeNumber.solution(5); // 2, 3, 5 => 3
//        System.out.println(solution2);
        boolean prime1 = primeNumber.isPrime(13);
        System.out.println(prime1);
        boolean prime2 = primeNumber.isPrime(17);
        System.out.println(prime2);
        boolean prime3 = primeNumber.isPrime(19);
        System.out.println(prime3);
        boolean prime4 = primeNumber.isPrime(23);
        System.out.println(prime4);
    }
}
