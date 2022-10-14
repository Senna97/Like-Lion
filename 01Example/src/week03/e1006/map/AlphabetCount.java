package week03.e1006.map;

import java.util.HashMap;
import java.util.Map;

public class AlphabetCount {

    public static boolean isAlphabet(char ch) {
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "aabcdefg".toUpperCase(); //소문자 -> 대문자

        Map<Character, Integer> alphabetMap = new HashMap<>();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabetMap.put(ch, 0);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isAlphabet(ch)) {
                //여기에서만 개수를 센다.
                alphabetMap.put(ch, alphabetMap.get(ch) + 1);
            }
        }

        System.out.println(alphabetMap);
    }
}
