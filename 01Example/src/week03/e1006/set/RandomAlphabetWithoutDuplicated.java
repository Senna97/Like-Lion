package week03.e1006.set;

import java.util.HashSet;

public class RandomAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();

        HashSet<Character> randomAlphabets = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            randomAlphabets.add(randomAlphabetGenerator.Generate());
        }

        System.out.println("알파벳 A ~ Z 까지 랜덤한 알파벳을 50개 생성하고 중복제거 해보세요.: " + randomAlphabets);
        System.out.println("갯수: " + randomAlphabets.size());
    }
}
