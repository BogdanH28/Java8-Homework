package siit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static siit.Main.filerAndSortPersons;

public class TestFilterAndSortPersons {

    private List<Person> listOfPersons;
    private Comparator<Person> nameComparator;

    @Before
    public void setup() {
        listOfPersons = new ArrayList<>();
        Person person1 = new Person("Heghes", "Bogdan", 12);
        Person person2 = new Person("Bogdan", "Radu", 1);
        Person person3 = new Person("Radu", "George", 2);
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(person3);

        nameComparator = (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName());
    }

    @Test
    public void testFilterAndSortPersonsReturnsCorrectListSize() {
        List<Person> testResult = filerAndSortPersons(listOfPersons, 12, nameComparator);
        assertThat(testResult.size(), is(1));
    }

}
