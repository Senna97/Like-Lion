package week03.e1007.project;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String address = "/Users/jangseohyeon/Downloads/2021_인구관련연간자료_20220927_66125.csv";
        ReadLineContext<PopulationMove> readLineContext = new ReadLineContext<>();
        List<PopulationMove> pml = readLineContext.readByLine(address);

        //System.out.println(pml.size());

        for (PopulationMove populationMove : pml) {
            System.out.printf("전입: %s, 전출: %s\n", populationMove.getFromSido(), populationMove.getToSido());
        }
    }
}
