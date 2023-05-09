import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingAFile {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\Paige\\Downloads\\example.txt");
            Scanner myReader = new Scanner(f);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
    }
}
