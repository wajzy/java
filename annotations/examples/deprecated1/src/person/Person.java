package person;

import java.util.Date;

public class Person {
    protected String name;
    protected Date birth;

    public Person(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "person.Person{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
