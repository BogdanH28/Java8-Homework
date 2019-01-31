package siit;

import java.util.ArrayList;
import java.util.List;

public class PersonCreator {
    private List<String> personList;
    private List<Person> listOfPersons = new ArrayList<>();

    public PersonCreator(List<String> personList) {
        this.personList = personList;
    }

    public List<Person> createPersonList() {
        int limit = 0;

        while (limit < personList.size()) {

            String personString = personList.get(limit);
            limit++;

            String[] stringSplit = splitString(personString);
            String[] date = splitDate(stringSplit[2]);
            int month = Integer.parseInt(date[1]);
            Person person = new Person(stringSplit[0], stringSplit[1], month);
            listOfPersons.add(person);
        }

        return listOfPersons;
    }

    public String[] splitString(String personString) {
        return personString.split(" ");
    }

    public String[] splitDate(String fullDate) {
        return fullDate.split("/");
    }
}
