import java.io.FileOutputStream;
import java.io.IOException;
public class E12{
    public static void main(String [] args){
        try(FileOutputStream output = new FileOutputStream("test.txt")){
            output.write("Hello World".getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}