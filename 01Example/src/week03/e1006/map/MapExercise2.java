package week03.e1006.map;

import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {
        String repositoryAddress = "https://github.com/Senna97/Like-Lion";
        //a, b, c, d, e, f, g, ~ z
        HashMap<String, Integer> alphabetCount = new HashMap<>();
        alphabetCount.put("n", 2);
        System.out.println(alphabetCount);
        //알파벳별 개수 출력하기
    }
}
