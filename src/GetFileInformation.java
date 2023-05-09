import java.io.File;
public class GetFileInformation {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Paige\\Downloads\\example.txt");
        if(f.exists()){
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size: " + f.length() +"byts");
        }
        else{
            System.out.println("This file does not exist.");
        }
    }
}
