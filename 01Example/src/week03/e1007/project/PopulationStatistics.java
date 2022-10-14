package week03.e1007.project;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//파일 읽어오기
public class PopulationStatistics {

    public void readByCharacter(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);

        //read() 사용 전에는 파일을 읽지 않는다.
        String fileContents = "";

        while (fileContents.length() < 1000000) {
            char ch = (char) fileReader.read();
            fileContents += ch;
        }

        System.out.println(fileContents);
        //1byte 읽기
        //1줄씩 읽기
    }

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

    public void readByLine2(String fileName) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.UTF_8)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PopulationMove parse(String data) {
        //data = "11,110,51500,2021,01,04,11,110,51500,5,1,033,1,,,,,,,,,,,,,,,,,,,,,,,,,,,,9";

        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[1]); //전입: to, 전출: from
    }

    public void createOneFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String fileName) {
        File file = new File(fileName);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {

        Map<String, Integer> moveCntMap = new HashMap<>();
        // A ~ Z

        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        //String address = "/Users/jangseohyeon/Downloads/2021_인구관련연간자료_20220927_66125.csv";

        String address = "./from_to.txt";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readByLine(address);


        Map<String, Integer> map = ps.getMoveCntMap(pml);
        String targetFileName = "for_heatmap.txt";
        ps.createOneFile(targetFileName);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String[] fromto = key.split(",");
            // 매핑을 해서 저장
            String s = String.format("[%s, %s, %d]\n", fromto[0], fromto[1], map.get(key));
            cntResult.add(s);
        }
        ps.write(cntResult, targetFileName);

//        List<String> strings = new ArrayList<>();
//        for (PopulationMove populationMove : pml) {
//            System.out.printf("전입: %s, 전출: %s\n", populationMove.getFromSido(), populationMove.getToSido());
//        }
    }
}