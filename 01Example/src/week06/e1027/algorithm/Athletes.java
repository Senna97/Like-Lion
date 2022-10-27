package week06.e1027.algorithm;

import java.util.*;

// 프로그래머스: 완주하지 못한 선수
public class Athletes {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            if (!memo.containsKey(key)) {
                memo.put(key, 0);
            }
            memo.put(key, memo.get(key) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, memo.get(key) - 1);
        }

        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
    }
}
