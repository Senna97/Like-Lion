package week09.e1118.algorithm;

public class CaesarCipher {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if (s.charAt(i) >= 'z') {
                    answer.append((char) (s.charAt(i) - 26 + n));
                } else {
                    answer.append((char) (s.charAt(i) + n));
                }
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (s.charAt(i) >= 'z') {
                    answer.append((char) (s.charAt(i) - 26 + n));
                } else {
                    answer.append((char) (s.charAt(i) + n));
                }
            } else if (s.charAt(i) == ' ') {
                answer.append(' ');
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();

        String s = "a B z";
        int n = 4;

        String result = caesarCipher.solution(s, n);
        System.out.println(result);
    }
}