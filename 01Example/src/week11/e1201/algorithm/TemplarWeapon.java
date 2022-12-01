package week11.e1201.algorithm;


public class TemplarWeapon {

    public int findDivisors(int number, int limit, int power) {
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                count += 1;
            } else if (number % i == 0) {
                count += 2;
            }
        }

        if (count > limit) {
            return power;
        }

        return count;
    }

    public int solution(int number, int limit, int power) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += findDivisors(i, limit, power);
        }
        return sum;
    }

    public static void main(String[] args) {
        TemplarWeapon templarWeapon = new TemplarWeapon();
        System.out.println(templarWeapon.solution(5, 3, 2)); // 10
        System.out.println(templarWeapon.solution(10, 3, 2)); // 21
    }
}
