package week03.e1006.set;

public class RandomAlphabetGenerator {
    public Character Generate() {
        int randomNumber = (int) (Math.random() * 26); //26개의 랜덤한 정수를 만들고
        char alphabet = (char) (randomNumber + 65); //A ~ Z에 해당하는 65 ~ 90를 만들기 위해 65를 더한다.
        return alphabet; //한 줄에 쓸 수도 있지만 이해가 편하도록 나눠서 썼다.
    }
}
