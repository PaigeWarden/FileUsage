import java.io.File;
public class ExistingFile {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Paige\\Downloads\\example.txt");
        if (!f.exists()) {
            System.out.println("The File does not exist.");
        }
            else
            System.out.println("This file does exist");
        }
        }

