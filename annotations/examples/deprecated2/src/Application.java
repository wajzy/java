import person.Person;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Example application to show deprecation warning
 */
public class Application {
    /**
     * Entry point of the application.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Person p1 = new Person("John Doe", new Date(1990, 1, 2));
        System.out.println(p1);
        System.out.println(p1.getName());
//        .../annotations/examples/deprecated2/src/Application.java:9:44
//        java: Date(int,int,int) in java.util.Date has been deprecated
//        .../annotations/examples/deprecated2/src/Application.java:9:21
//        java: Person(java.lang.String,java.util.Date) in person.Person has been deprecated
//        .../annotations/examples/deprecated2/src/Application.java:11:30
//        java: getName() in person.Person has been deprecated
        Person p2 = new Person("Jane", "Doe", new GregorianCalendar(1990, Calendar.MARCH, 4));
        System.out.println(p2);
        System.out.println(p2.getName());
    }
}
