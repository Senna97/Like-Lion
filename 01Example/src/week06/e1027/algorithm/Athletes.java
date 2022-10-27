package week06.e1027.algorithm;

import java.util.*;

// 프로그래머스: 완주하지 못한 선수
public class Athletes {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();

        for (String member : participant) {
            memo.put(member, memo.getOrDefault(member, 0) + 1);
        }

        for (String member : completion) {
            memo.put(member, memo.getOrDefault(member, 0) - 1);
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
