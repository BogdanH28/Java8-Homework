package siit;

import java.io.Serializable;

public class Person implements Serializable {

//    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private int monthOfBirthDate;

    public Person(String lastName, String firstName, int monthOfBirthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirthDate = monthOfBirthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMonthOfBirthDate() {
        return monthOfBirthDate;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + '\n';
    }
}
