package week03.e1005.randomcalculator;

public class RandomNumberCreator implements NumberCreator {
    @Override
    public int getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
