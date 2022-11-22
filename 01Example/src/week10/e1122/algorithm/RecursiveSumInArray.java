package week10.e1122.algorithm;

public class RecursiveSumInArray {

    public int sumInArray(int[] nums, int idx, int sum) {

        if (idx == nums.length) {
            return sum;
        }

        return sumInArray(nums, idx + 1, sum + nums[idx]);
    }

    public static void main(String[] args) {
        RecursiveSumInArray recursiveSumInArray = new RecursiveSumInArray();
        int[] nums = {7, 3, 2, 9};
        int sum = recursiveSumInArray.sumInArray(nums, 0, 0);
        System.out.println(sum);
    }
}