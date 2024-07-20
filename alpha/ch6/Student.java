public class Student {
    private String name;
    private int age;
    private String department;

    // Getter methods to access the private data fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // Setter methods to modify the private data fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Please provide a valid age between 0 and 100.");
        }
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    public static void main(String[] args) {
        Student student = new Student();

        // Using setter methods to set the values
        student.setName("John Doe");
        student.setAge(20);
        student.setDepartment("Computer Science");

        // Using getter methods to access the values
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());
    }
}
