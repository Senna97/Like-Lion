package week03.e1005.randomcalculator;

public class RandomCalculator {
    NumberCreator randomNumberCreator = new RandomNumberCreator();
    int randomNumber = randomNumberCreator.getRandomNumber();
    void plus(int a) {
        System.out.println(a + randomNumber);
    }

    void minus(int a) {
        System.out.println(a - randomNumber);
    }

    void multiple(int a) {
        System.out.println(a * randomNumber);
    }

    void divide(int a) {
        System.out.println(a / randomNumber);
    }
}