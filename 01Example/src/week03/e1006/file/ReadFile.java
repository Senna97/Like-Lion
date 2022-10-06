package week03.e1006.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    static void ReadOneLetter(String fileName) throws IOException { //맨 앞 한 글자를 읽어오는 method
        FileReader fr = new FileReader(fileName);
        char ch = (char) fr.read();
        System.out.println(ch);
    }

    static void ReadTwoLetter(String fileName) throws IOException { //맨 앞 두 글자를 읽어오는 method
        FileReader fr = new FileReader(fileName);
        for (int i = 0; i < 2; i++) {
            char ch = (char) fr.read();
            System.out.print(ch);
        }
        System.out.println();
    }

    static void ReadNLetter(String fileName, int num) throws IOException { //맨 앞 n 글자를 읽어오는 method
        FileReader fr = new FileReader(fileName);
        for (int i = 0; i < num; i++) {
            char ch = (char) fr.read();
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        ReadOneLetter("a_file.txt");
        ReadTwoLetter("a_file.txt");
        ReadNLetter("a_file.txt", 4);
    }
}
