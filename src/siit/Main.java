package siit;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        List<String> personList = fileReader.createListFromFile();

        PersonCreator personCreator = new PersonCreator(personList);
        List<Person> listOfPersons = personCreator.createPersonList();

        int givenMonth = selectMonth(2);

        Comparator<Person> nameComparator = (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName());

        List <Person> finalList = filerAndSortPersons(listOfPersons, givenMonth, nameComparator);

        writeToFile(finalList);
    }

    public static int selectMonth(int month) {
        if(month >= 1 && month <= 12) {
            return month;
        } else {
            System.out.println("Invalid number!");
        }

        return 0;
    }

    public static void writeToFile(List<Person> finalList) {
        FileWriter fileWriter = new FileWriter(finalList);
        try {
            fileWriter.FromListToOutFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All Done!");
    }

    public static List<Person> filerAndSortPersons(List<Person> listOfPersons, int givenMonth, Comparator<Person> nameComparator) {
         return listOfPersons.stream()
                .filter(person -> givenMonth == person.getMonthOfBirthDate())
                .sorted(nameComparator)
                .collect(Collectors.toList());
    }

}
