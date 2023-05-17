import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int bajt;

        try {
            fis = new FileInputStream("test123.txt");
            // open the file
            // fis = new FileInputStream("C:\\Users\\biele\\workspace\\HelloVisBielecki\\test123.txt")

            // read bytes until EOF is encountered
            do {
                bajt = fis.read(); // read from the file
                if (bajt != -1) {
                    System.out.print((char) bajt);
                }
            } while (bajt != -1); // when bajt equals -1, the end of the file has been reached
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
