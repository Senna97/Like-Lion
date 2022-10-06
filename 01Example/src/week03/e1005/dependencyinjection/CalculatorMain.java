package week03.e1005.dependencyinjection;

public class CalculatorMain {
    public static void main(String[] args) {
        RandomCalculator randomCalculator = new RandomCalculator();

        randomCalculator.Plus(5);
        randomCalculator.Minus(5);
        randomCalculator.Multiple(5);
        randomCalculator.Divide(5);

    }
}

