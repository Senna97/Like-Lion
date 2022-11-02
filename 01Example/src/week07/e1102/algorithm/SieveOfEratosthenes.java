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

        for (int i = 2; i <= Math.sqrt(capacity); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) % i == 0 && list.get(j) != i) {
                    list.remove(j);
                }
            }
        }

        System.out.println(list);
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        sieveOfEratosthenes.findPrime();
    }
}
