package inheritance;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Bobby", 14);

        agePerson(person);
        agePerson(person);
    }

    public static void agePerson(Person person) {
        person.age += 1;
        System.out.println(String.format("Happy Birthday! %s is now %s years old.", person.name, person.age));
    }
}
