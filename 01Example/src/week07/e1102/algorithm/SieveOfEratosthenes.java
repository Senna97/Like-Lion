package week07.e1102.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {

    void findPrime() {
        int capacity = 49;
        List<Integer> list = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            list.add(i + 2);
        }

        list.removeIf(integer -> integer % 2 == 0 && integer != 2);

        System.out.println(list);
    }

    public static void main(String[] args) {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        sieveOfEratosthenes.findPrime();
    }
}
