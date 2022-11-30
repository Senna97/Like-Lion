package week11.e1130.algorithm;

public class SumOfDivisors {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SumOfDivisors sumOfDivisors = new SumOfDivisors();
        System.out.println(sumOfDivisors.solution(12)); // 28
        System.out.println(sumOfDivisors.solution(5)); // 6
    }
}
