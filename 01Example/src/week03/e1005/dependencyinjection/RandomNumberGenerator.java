package week03.e1005.dependencyinjection;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int Generate(int num) {
        return (int) (Math.random() * num); //num 이 max 가 된다는 의미
    }
}