import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("source.txt");
             FileWriter fileWriter = new FileWriter("destination.txt")) {

            int charCode;
            while ((charCode = fileReader.read()) != -1) {
                char character = (char) charCode;
                if (character == ' ') {
                    character = '-';
                }
                fileWriter.write(character);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copying: " + e.getMessage());
        }
    }
}
