package PatternsHometask1;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        if (this.name == null) {
            throw new IllegalArgumentException("Name isn't created");
        }
        if (this.surname == null) {
            throw new IllegalArgumentException("Surname isn't created");
        }
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(PersonBuilder personBuilder) {
        if (personBuilder == null) {
            throw new IllegalArgumentException("nonono");
        }
//        if (personBuilder.name == null) {
//            throw new IllegalArgumentException("Name isn't created");
//        }
//        if (personBuilder.surname == null) {
//            throw new IllegalArgumentException("Surname isn't created");
//        }
//        if (!hasAge()) {
//            throw new IllegalArgumentException("You don't know the age");
//        }
//        if (!hasAddress()) {
//            throw new IllegalArgumentException("Address isn't created");
//        }
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }


    public boolean hasAge() {
        if (age > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        if (address != null) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthDay() {
        age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + address + '\'' +
                '}';
    }

    public PersonBuilder childBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.setSurname(this.surname);
        child.setAddress(this.address);
        return child;
    }
}

//TODO create class person with methods and parametrs
// what is the goal of optionalint
// why we use protected modifier

