package Lab13April;
import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Create an ArrayList to store Person objects
        ArrayList<Person> persons = new ArrayList<>();

        // Add 10 Person objects to the ArrayList
        persons.add(new Person("Deepak", 25));
        persons.add(new Person("Monu", 30));
        persons.add(new Person("Sonu", 20));
        persons.add(new Person("Ajeet", 27));
        persons.add(new Person("Manish", 22));
        persons.add(new Person("Sara", 35));
        persons.add(new Person("Dhawan", 28));
        persons.add(new Person("Meena", 31));
        persons.add(new Person("Tushar", 26));
        persons.add(new Person("Alia", 29));

        // Print the Person objects using a for each loop
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
