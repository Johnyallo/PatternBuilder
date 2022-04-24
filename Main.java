package PatternsHometask1;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Tamara")
                .setSurname("Pekerman")
                .setAge(9)
                .setAddress("Smolensk")
                .build();
        System.out.println(person);
        Person child = person.childBuilder()
                .setName("Corneliy")
                .setAge(2)
                .build();
        System.out.println(child);
    }
}
