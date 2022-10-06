package week03.e1005.randomcalculator;

public class RandomCalculator {
    int randomNumber;

    public RandomCalculator(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    void Plus(int a) {
        System.out.println(a + this.randomNumber);
    }

    void Minus(int a) {
        System.out.println(a - this.randomNumber);
    }

    void Multiple(int a) {
        System.out.println(a * this.randomNumber);
    }

    void Divide(int a) {
        System.out.println(a / this.randomNumber);
    }
}

