package siit;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    private List<String> list = new ArrayList<>();


    public List<String> createListFromFile() {
        String inFileName = "C:\\Users\\PC\\Desktop\\HomeworksSIIT\\Java8-Homework\\files\\in.csv";

        try (BufferedReader br = Files.newBufferedReader(Paths.get(inFileName))) {
            list = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
