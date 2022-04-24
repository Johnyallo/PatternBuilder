package PatternsHometask1;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder() {
        super();
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        if (this.name == null) {
            throw new IllegalArgumentException("Name isn't created");
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        if (this.surname == null) {
            throw new IllegalArgumentException("Surname isn't created");
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person;

        if (this.age < 0) {
            person = new Person(this.name, this.surname);
            //setAge(this.age);
        } else {
            person = new Person(this.name, this.surname, this.age);
        }
        if (this.address != null) {
            person.setAddress(this.address);
        }
        return person;
    }
}

