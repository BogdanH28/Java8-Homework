package siit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestPersonCreator {

    private PersonCreator personCreator;
    private List<String> personList;

    @Before
    public void setup() {
        personList = new ArrayList<>();
        personCreator = new PersonCreator(personList);
    }

    @Test
    public void testStringSplitReturnsDesiredStringArray() {
        String[] testResult = personCreator.splitString("Heghes Bogdan 28/12/1995");
        assertThat(testResult[0], is("Heghes"));
        assertThat(testResult[1], is("Bogdan"));
        assertThat(testResult[2], is("28/12/1995"));
    }

    @Test
    public void testDateSplitReturnsDesiredMonth() {
        String[] testResult = personCreator.splitDate("28/12/1995");
        assertThat(testResult[1], is("12"));
    }
}
