package week09.e1115.algorithm;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public List<Integer> sort(List<Integer> arr) {

        if (arr.size() <= 1) {
            return arr;
        }

        // 1. 기준값 뽑기
        int pivot = arr.get(arr.size() / 2);

        // 2. 기준값 기준으로 좌, 우로 나누기
        List<Integer> low = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> high = new ArrayList<>();

        for (Integer element : arr) {
            if (element < pivot) {
                low.add(element);
            } else if (element > pivot) {
                high.add(element);
            } else {
                mid.add(pivot);
            }
        }

        return join(sort(low), mid, sort(high));
    }

    public List<Integer> join(List<Integer> low, List<Integer> mid, List<Integer> high) {
        List<Integer> joined = new ArrayList<>();
        joined.addAll(low);
        joined.addAll(mid);
        joined.addAll(high);

        return joined;
    }

    public static void main(String[] args) {
        int[] nums = {20, 18, 5, 19, 40, 50, 5, 25};

        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }

        QuickSort quickSort = new QuickSort();
        List<Integer> result = quickSort.sort(numsList);
        System.out.println(result);
    }
}