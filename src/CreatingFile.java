import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Paige\\Downloads\\example.txt");
        try {
            if (f.createNewFile())
                System.out.println("File created.");
            else
                System.out.println("File cannot be created.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
