package week03.e1007.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static week03.e1007.project.PopulationStatistics.parse;

public class ReadLineContext<T> {
    DoSomething<T> doSomething;

    public List<PopulationMove> readByLine(String fileName) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String str;
        while ((str = bufferedReader.readLine()) != null) {
            PopulationMove populationMove = parse(str);
            pml.add(populationMove);
        }
        bufferedReader.close();
        return pml;
    }

}
