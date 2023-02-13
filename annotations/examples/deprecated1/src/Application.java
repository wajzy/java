import person.Person;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
//        @SuppressWarnings("deprecation") // Turn off deprecation warnings
        Person p1 = new Person("John Doe", new Date(1990, 1, 2));
//        .../annotations/examples/deprecated1/src/Application.java:8:44
//        java: Date(int,int,int) in java.util.Date has been deprecated
        System.out.println(p1);
        System.out.println(p1.getName());
    }
}
