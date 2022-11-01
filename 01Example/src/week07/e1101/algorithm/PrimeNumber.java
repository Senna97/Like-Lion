package week07.e1101.algorithm;

public class PrimeNumber {

    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i != 0) {
                answer++;
            }
        }
        if (answer != 0) {
            System.out.println("소수입니다.");
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
//        int solution1 = primeNumber.solution(10);
//        System.out.println(solution1); // 2, 3, 5, 7 => 4
//        int solution2 = primeNumber.solution(5); // 2, 3, 5 => 3
//        System.out.println(solution2);
        primeNumber.solution(13);
        primeNumber.solution(17);
        primeNumber.solution(19);
        primeNumber.solution(23);

    }
}
