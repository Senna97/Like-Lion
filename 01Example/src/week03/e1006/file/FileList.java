package week03.e1006.file;

import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
}
    /*
    ./02Assignment
    ./out
    ./01Example
    ./README.md
    ./.gitignore
    ./.git
    ./a_file.txt
    ./Like-Lion.iml
    ./.idea
    ./src
     */
