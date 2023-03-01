
package mypackage;
/*if we create fully encapsulated class in java than we have to make all
the data member of the class private */
//we can use getter and setter method to set and get the data
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        //print the name and age of the person
        System.out.println(name+" "+age);   }
}

