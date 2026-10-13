
import java.io.*;
import java.util.Scanner;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("lines.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter line " + i + ": ");
                writer.write(input.nextLine() + System.lineSeparator());
            }

            writer.close();

            System.out.println("\nContents of the file:");

            BufferedReader reader =
                new BufferedReader(new FileReader("lines.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        input.close();
    }
}
