package week03.e1005.randomcalculator;

public class RandomCalculatorMain implements RandomNumber {

    public static int GetRandomNumber() {
        return (int) (Math.random() * 10);
    }

    public static void main(String[] args) {
        int randomNumber = GetRandomNumber();
        RandomCalculator randomCalculator = new RandomCalculator(randomNumber);

        randomCalculator.Plus(5);
        randomCalculator.Minus(5);
        randomCalculator.Multiple(5);

        try {
            randomCalculator.Divide(5);
        } catch (ArithmeticException ae) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
    }
}

