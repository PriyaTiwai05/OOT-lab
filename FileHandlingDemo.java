
    
import java.io.*;

class FileHandlingDemo {
    public static void main(String[] args) {

        try {
            // Writing into a file
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Welcome to Java File Handling!");
            writer.write("\nName: Karan");
            writer.write("\nCourse: B.Tech CSE");

            writer.close();

            System.out.println("Data written successfully.");

            // Reading from a file
            FileReader reader = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("\nFile Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
