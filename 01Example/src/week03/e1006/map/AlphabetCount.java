package week03.e1006.map;

public class AlphabetCount {

    public static boolean isAlphabet(char c) {
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            System.out.println(isAlphabet(c));
        }
    }
}
