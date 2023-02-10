package person;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
//    protected String name;
    protected String firstName;
    protected String lastName;
//    protected Date birth;
    protected Calendar birth;

    @Deprecated
    public Person(String name, Date birth) {
        this.firstName = name;
        this.birth = new GregorianCalendar();
        this.birth.setTime(birth);
    }

    public Person(String firstName, String lastName, Calendar birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    @Deprecated
    public String getName() {
        return lastName==null? firstName : String.join(", ", firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Deprecated
    public Date getBirth() {
        return birth.getTime();
    }

    public Calendar getBirthDay() {
        return birth;
    }

    //    @Override
//    public String toString() {
//        return "person.Person{" +
//                "name='" + name + '\'' +
//                ", birth=" + birth +
//                '}';
//    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birth=" + birth +
                '}';
    }
}
