package week03.e1006.map;

public class AlphabetCount {

    public static boolean isAlphabet(char ch) {
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            System.out.println(isAlphabet(ch));
        }
    }
}
