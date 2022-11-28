package week11.e1128.algorithm;

public class Alphabet {
    public static void main(String[] args) {
        int count = 0;
        for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
            for (char ch2 = 'A'; ch2 <= 'Z'; ch2++) {
                System.out.printf("%s%s\n", ch1, ch2);
                count++;
            }
        }
        System.out.printf("조합의 총 개수: %d", count);
    }
}
