import java.io.File;
public class DeleteFile {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\Paige\\Downloads\\example.txt");
        if(f.delete()) {
            System.out.println("Deleted file: " +f.getName());
        }
        else {
            System.out.println("Failed to delete.");
        }
    }
}
