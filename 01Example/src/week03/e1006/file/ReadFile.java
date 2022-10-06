package week03.e1006.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    static void ReadOneByte(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        int ch;

        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    public static void main(String[] args) throws IOException {
        ReadOneByte("a_file.txt");
    }
}
