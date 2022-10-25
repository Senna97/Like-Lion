package week06.e1025.hash;

public class HashFunction {

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }

    public static void main(String[] args) {
        HashFunction hashFunction = new HashFunction();
        int result = hashFunction.hash("seohyeon");
        System.out.println(result);
    }
}
