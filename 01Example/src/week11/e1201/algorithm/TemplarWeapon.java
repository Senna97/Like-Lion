package week11.e1201.algorithm;


public class TemplarWeapon {

    public int solution(int number, int limit, int power) {
        int[] intArr = new int[number];

        for (int i = 0; i < number; i++) {
            intArr[i] = i + 1;
        }

        int count = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 1; j <= intArr.length; j++) {
                if (intArr[i] % j == 0) {
                    count += 1;
                }
            }
            intArr[i] = count;
            count = 0;
        }

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > limit) {
                intArr[i] = power;
            }
        }

        int sum = 0;
        for (int i : intArr) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        TemplarWeapon templarWeapon = new TemplarWeapon();
        System.out.println(templarWeapon.solution(5, 3, 2)); // 10
        System.out.println(templarWeapon.solution(10, 3, 2)); // 21
    }
}
