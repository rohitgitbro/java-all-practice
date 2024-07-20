public class constructor {
    public static void main(String args[]) {
        // Student s1 = new Student("rohit");
        // System.out.println(s1.name);
        Student s1 = new Student(); // automatically call by java
        Student s2 = new Student("sanatani");
        Student s3 = new Student(213);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("consructor is called....");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

}
