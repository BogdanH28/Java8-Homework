package siit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static siit.Main.selectMonth;

public class TestGivenMonth {

    @Test
    public void testGivenMonthIsValidNumberReturnsNumber() {
        int month = selectMonth(3);
        assertThat(month, is(3));
    }

    @Test
    public void testGivenMonthIsInvalidPrintsMessageAndReturnsZero() {
        int month = selectMonth(13);
        assertThat(month, is(0));
    }

}

