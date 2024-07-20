class Person {
    String name;

    Person(String name) {
        this.name = name; // 'this' refers to the instance variable 'name'
    }

    void printName() {
        System.out.println("Name: " + this.name); // 'this' is optional here
    }
}

public class pr22222 {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        person.printName();
    }

        }