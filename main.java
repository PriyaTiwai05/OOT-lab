// Parent class
class Person {

    void displayPerson() {
        System.out.println("I am a person.");
    }
}

// Child class: Single Inheritance
class Student extends Person {

    void displayStudent() {
        System.out.println("I am a student.");
    }
}

// Child class: Multilevel Inheritance
class GraduateStudent extends Student {

    void displayGraduate() {
        System.out.println("I am a graduate student.");
    }
}

// Main class
public class main{
    public static void main(String[] args) {

        // Single Inheritance
        Student s = new Student();

        System.out.println("Single Inheritance:");
        s.displayPerson();
        s.displayStudent();

        // Multilevel Inheritance
        GraduateStudent g = new GraduateStudent();

        System.out.println("\nMultilevel Inheritance:");
        g.displayPerson();
        g.displayStudent();
        g.displayGraduate();
    }
}
