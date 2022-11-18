package week09.e1118.algorithm;

public class CaesarCipher {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                answer.append(upperReplace(s.charAt(i), n));
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                answer.append(lowerReplace(s.charAt(i), n));
            } else if (s.charAt(i) == ' ') {
                answer.append(' ');
            }
        }
        return answer.toString();
    }

    public char upperReplace(char ch, int n) {
        if (ch + n > 'Z') {
            ch = (char)(ch - 26 + n);
        } else {
            ch = (char)(ch + n);
        }
        return ch;
    }

    public char lowerReplace(char ch, int n) {
        if (ch + n > 'z') {
            ch = (char)(ch - 26 + n);
        } else {
            ch = (char)(ch + n);
        }
        return ch;
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();

        String s = "a B z";
        int n = 4;

        String result = caesarCipher.solution(s, n);
        System.out.println(result);
    }
}