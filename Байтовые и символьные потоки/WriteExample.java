import java.io.*;

public class WriteExample {
    public static void main(String[] args) throws IOException {
        OutputStream output = new ByteArrayOutputStream();
        
        output.write(72);  
        output.write(101); 
        output.write(108); 
        output.write(108); 
        output.write(111); 
        
        System.out.println(output.toString());
    }
}