import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOExample {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("students.txt");

            writer.write("Tanatswa\n");
            writer.write("Nyasha\n");
            writer.write("Jeff\n");

            writer.close();

            System.out.println("File written successfully.");

            File file = new File("students.txt");
            Scanner reader = new Scanner(file);

            System.out.println("Student Names:");

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
        }
    }
}
