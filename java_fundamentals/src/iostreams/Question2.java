package iostreams;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileReader reader = new FileReader("src/iostreams/input.txt");
	            FileWriter writer = new FileWriter("Output.txt");
	            int charRead;
	            while ((charRead = reader.read()) != -1) {
	                writer.write(charRead);
	            }
	            reader.close();
	            writer.close();
	            System.out.println("File is copied");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
