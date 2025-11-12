import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try {
            // Open input and output streams
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt");

            int data;
            // Read one byte at a time and write it to the output file
            while ((data = in.read()) != -1) {
                out.write(data);
            }

            // Close streams
            in.close();
            out.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
