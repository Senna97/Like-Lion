package week09.e1114.algorithm;

public class SieveOfEratosthenes {

    public int solution(int n) {
        int[] nums = new int[n - 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }

        int idx = 0;
        for (int i = 2; i <= Math.sqrt(nums.length); i++) {
            for (int j = nums[idx] + idx; j < nums.length; j += i) {
                nums[j] = 0;
            }
            idx++;
        }

        int count = 0;
        for (int num : nums) {
            if (num != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        int solution = sieveOfEratosthenes.solution(50);
        System.out.println(solution);
    }
}