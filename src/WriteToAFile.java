import java.io.FileWriter;
import java.io.IOException;
public class WriteToAFile {

    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\Paige\\Downloads\\example.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();

            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }

    }
}
