package iostreams;
import java.io.FileReader;
import java.io.IOException;

public class Question1{
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/iostreams/input.txt");
            char searchChar = 'r'; // Character to be counted
            int charCount = 0;
            int charRead;
            while ((charRead = reader.read()) != -1) {
                if ((char) charRead == searchChar) {
                    charCount++;
                }
            }
            reader.close();
            System.out.println("File 'Input.txt' has " + charCount + " instances of letter '" + searchChar + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}