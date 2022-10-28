package week06.e1028.algorithm;

import java.util.HashSet;
import java.util.Set;

// 프로그래머스: 전화번호 목록
public class PhoneNumberList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Set<String> set = new HashSet<>();
        for (String num : phone_book) {
            set.add(num);
        }

        String min = phone_book[0];
        for (String num : set) {
            if (min.length() <= num.length()) {
                min = min;
            } else {
                min = num;
            }
        }

        for (String num : set) {
            if (num.contains(min) && !num.equals(min)) {
                answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] phoneBook = new String[]{"123", "456", "789"};
        PhoneNumberList phoneNumberList = new PhoneNumberList();
        boolean result = phoneNumberList.solution(phoneBook);
        System.out.println(result);
    }
}
