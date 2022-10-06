package week03.e1005.dependencyinjection;

public class RandomCalculator {

    NumberGenerator numberGenerator = new RandomNumberGenerator();

    double randomNum = numberGenerator.Generate(5);

    public void Plus(int num) {
        System.out.println(randomNum + num);
    }

    public void Minus(int num) {
        System.out.println(randomNum - num);
    }

    public void Multiple(int num) {
        System.out.println(randomNum * num);
    }

    public void Divide(double num) {
        System.out.println(randomNum / num);
    }
}
