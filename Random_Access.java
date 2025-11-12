import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessExample {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");
            raf.seek(20);                 // Move to position 20
            raf.writeBytes("Hello");      // Write data
            raf.seek(0);                  // Go back to start
            String line;
            while ((line = raf.readLine()) != null)
                System.out.println(line);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
