public class Experiment_2 {
  static int objectCount = 0;
Experiment_2  () {
        objectCount++;
    }
// Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }
// Method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
// Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }
// Static method
    static void showObjectCount() {
        System.out.println(
            "Objects created: " + objectCount
        );
    }
public static void main(String[] args) {

        Experiment_2 c1 = new Experiment_2();
        Experiment_2 c2 = new Experiment_2();

        System.out.println(
            "Sum of 2 integers: " + c1.add(10, 20)
        );

        System.out.println(
            "Sum of 3 integers: " + c1.add(10, 20, 30)
        );

        System.out.println(
            "Sum of decimals: " + c2.add(2.5, 3.5)
        );

        Experiment_2.showObjectCount();
    }
} 
    

