package week10.e1122.algorithm;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSumInList {

    public int sumInList(List<Integer> intList) {
        if (intList.isEmpty()) {
            return 0;
        }

        return intList.remove(intList.size() - 1) + sumInList(intList);
    }

    public static void main(String[] args) {
        RecursiveSumInList recursiveSumInArray = new RecursiveSumInList();
        List<Integer> intList = new ArrayList<>();
        intList.add(7);
        intList.add(3);
        intList.add(2);
        intList.add(9);

        int sum = recursiveSumInArray.sumInList(intList);
        System.out.println(sum);
    }
}