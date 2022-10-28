package week06.e1028.algorithm;

import java.util.HashSet;
import java.util.Set;

// 프로그래머스: 폰켓몬
public class PhoneketMon {

    public int solution(int[] nums) {
        int answer;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) { // 중복을 없애기 위해 set 에 넣는다. {3, 1, 2, 3} -> {3, 1, 2}
            set.add(num);
        }

        int length = nums.length / 2;

        if (set.size() < length) { // set.size()나 length 중에 return
            answer = set.size();
        }
        answer = length;

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 3};
        PhoneketMon phoneketMon = new PhoneketMon();
        int result = phoneketMon.solution(nums);
        System.out.println(result);
    }
}
