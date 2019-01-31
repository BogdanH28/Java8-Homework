package siit;

import java.io.PrintWriter;
import java.util.List;

public class FileWriter {

    public List<Person> listOfPersons;

    public FileWriter(List<Person> listOfPersons) {
        this.listOfPersons = listOfPersons;
    }

    public void FromListToOutFile() throws Exception {
        String outFileName = "C:\\Users\\PC\\Desktop\\HomeworksSIIT\\Java8-Homework\\files\\out.csv";

        try (PrintWriter out = new PrintWriter(outFileName)) {
            listOfPersons.forEach(person -> out.println(person));
        }
    }

}
