package week04.e1011.algorithm;

//프로그래머스 자릿수 더하기
public class SumOfDigit {

    int solution(int n) {
        // % 연산 이용 (몫과 나머지)
        // Currency 문제와 유사
        int result = 0;
//        int origin = n; //공간복잡도 증가 => origin 대신 n 사용

        // for 문으로 가능할까?
        // while 문으로 가능

//        // i = 0
//        System.out.println(n / 10); // 1234 / 10 몫 123
//        System.out.println(n % 10); // 나머지 4
//
//        // i = 1
//        System.out.println(n / 10); // 123 / 10 몫 12
//        System.out.println(n % 10); // 나머지 3

//        while (origin > 0) {
//            result += origin % 10;
//            origin = origin / 10;
//            System.out.printf("origin: %d, result: %d\n", origin, result);
//        }

        while (n > 0) {
            result += n % 10;
            n = n / 10;
        }

        return result;
    }

    int solutionB(int n) {
        // n 을 String 으로 변경
        String str = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        //String 을 loop 돌면서 parseInt 후 더한다.

        return result;
    }

    public static void main(String[] args) {

    }
}

