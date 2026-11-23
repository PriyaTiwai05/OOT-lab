class Student {
    int rollNo;
    String name;
    // Default Constructor
    Student() {
        rollNo = 0;
        name = "not assigned";
    }
    // Parameterized Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
   // Method to display details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
public class Experiment_1{
    public static void main(String[] args) {

        // Object using default constructor
        Student s1 = new Student();

        // Object using parameterized constructor
        Student s2 = new Student(101, "Priya");

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println("\nParameterized Constructor:");
        s2.display();
    }
}