package week03.e1006.set;

public class RandomAlphabetGenerator {
    public Character Generate() {
        int randomNumber = (int) (Math.random() * 26);
        char alphabet = (char) (randomNumber + 65);
        return alphabet;
    }
}
