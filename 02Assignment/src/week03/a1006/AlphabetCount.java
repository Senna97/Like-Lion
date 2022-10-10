package week03.a1006;

import java.util.HashMap;
import java.util.Map;

//알파벳 개수 세기 알고리즘
public class AlphabetCount {

    boolean isAlphabet(char ch) { // 알파벳이면 true return method

        if (ch >= 'A' && ch <= 'Z') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String repoAdd = "https://github.com/Senna97/Like-Lion"; // 1)어떤 특정 문자열이 있을 때
        repoAdd = repoAdd.toUpperCase(); // 2)우선 대소문자 구분을 하지 않으므로 모두 대문자로 바꿔준다.

        AlphabetCount alphabetCount = new AlphabetCount(); // 3)메서드 사용을 위해 만든 클래스 객체
        Map<Character, Integer> alphabetMap = new HashMap<>(); // 4) count 한 알파벳과 그 개수를 저장할 맵

        for (int i = 0; i < repoAdd.length(); i++) {
            char ch = repoAdd.charAt(i); // 5) 문자를 하나씩 뗴어

            if (alphabetCount.isAlphabet(ch)) { // isAlphabet() 메서드에 넣고 true 이면(= 알파벳이면)
                if (!alphabetMap.containsKey(ch)) { // 6) 없는 문자이면
                    alphabetMap.put(repoAdd.charAt(i), 1); // value 를 1로 초기화를 하고
                } else { // 7) 아니면(= 이미 들어있는 문자이면)
                    alphabetMap.put(ch, alphabetMap.get(ch) + 1); // value 를 +1 한다.
                }
            }
        }
        System.out.print("레포지토리 주소에 들어있는 알파벳과 그 개수: ");
        System.out.println(alphabetMap);
    }
}
