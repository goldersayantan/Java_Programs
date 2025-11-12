import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try {
            // Open reader and writer
            FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("output.txt");

            int data;
            // Read one character at a time and write it to the output file
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            // Close reader and writer
            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
