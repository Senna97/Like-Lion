package week11.e1130.algorithm;

public class CountPAndY {

    boolean solution(String s) {
        s = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pCount += 1;
            }

            if (s.charAt(i) == 'y') {
                yCount += 1;
            }
        }

        return pCount == yCount;
    }

    public static void main(String[] args) {
        CountPAndY countPAndY = new CountPAndY();
        System.out.println(countPAndY.solution("pPoooyY"));
        System.out.println(countPAndY.solution("Pyy"));
    }
}
