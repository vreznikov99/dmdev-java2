package equalshashcode;

import java.util.Objects;

public class Person implements Users{
    int id;
    String name;
    String lastname;

    public Person(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname);
    }
}
