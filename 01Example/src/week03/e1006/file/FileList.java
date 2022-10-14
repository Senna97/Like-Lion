package week03.e1006.file;

import java.io.File;

public class FileList {

    public static void PrintFileLists() {
        File dir = new File("./"); //현재 디렉터리 파일 목록
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

    public static void main(String[] args) {
        PrintFileLists();
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
