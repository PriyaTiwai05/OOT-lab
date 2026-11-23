// Interface
interface Printable {
    void print();
}

// Abstract class
abstract class Shape {
    abstract double area();
}

// Class extending abstract class and implementing interface
class Circle extends Shape implements Printable {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public void print() {
        System.out.println("Shape: Circle");
    }
}

// Main class
class experiment_4{
    public static void main(String[] args) {

        Circle c = new Circle(5);

        c.print();

        System.out.println("Area: " + c.area());
    }
}
