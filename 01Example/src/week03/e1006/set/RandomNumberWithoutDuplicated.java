package week03.e1006.set;

import week03.e1005.dependencyinjection.RandomNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class RandomNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        Set<Integer> randomNumbers = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            randomNumbers.add(randomNumberGenerator.Generate(100));
        }

        System.out.println("random number 50개를 생성하고 중복이 되지 않은 숫자만 남기는 것: " + randomNumbers);
        System.out.println("개수: " + randomNumbers.size());
    }
}
