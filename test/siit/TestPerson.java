package siit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestPerson {

    @Test
    public void testPersonIsCreatedCorrectly() {
        Person person = new Person("Heghes", "Bogdan", 12);
        assertThat(person.getFirstName(), is("Bogdan"));
        assertThat(person.getLastName(), is("Heghes"));
        assertThat(person.getMonthOfBirthDate(), is(12));
    }
}
