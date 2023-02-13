package person;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Details of a person
 * @version 2.0
 */
public class Person {
    /** First name */
    protected String firstName;
    /** Last name */
    protected String lastName;
    /** Birthday */
    protected Calendar birth;

    /**
     * @deprecated Name is separated to firstName and lastName. GregorianCalendar is used instead of the outdated Date class.
     * @param name Name of a person.
     * @param birth Birthday of a person.
     */
    @Deprecated
    public Person(String name, Date birth) {
        this.firstName = name;
        this.birth = new GregorianCalendar();
        this.birth.setTime(birth);
    }

    /**
     * Creates a new Person with first name, last name and birthday.
     * @param firstName First name
     * @param lastName Last name
     * @param birth Birthday
     */
    public Person(String firstName, String lastName, Calendar birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    /**
     * @deprecated Use getFirstName() or getLastName() instead.
     * @return Combined name of a person
     */
    @Deprecated
    public String getName() {
        return lastName==null? firstName : String.join(", ", firstName, lastName);
    }

    /**
     * @return The first name of a person.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return Last name of a person.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @deprecated Use getBirthDay() instead.
     * @return The birthday of a person.
     */
    @Deprecated
    public Date getBirth() {
        return birth.getTime();
    }

    /**
     * @since v2.0
     * @return The birthday of a person as a Calendar object.
     */
    public Calendar getBirthDay() {
        return birth;
    }

    @Override
    public String toString() {
        return "person.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birth=" + birth +
                '}';
    }
}
