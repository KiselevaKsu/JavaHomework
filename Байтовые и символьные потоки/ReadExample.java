import java.io.*;

public class ReadExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {72, 101, 108, 108, 111}; 
        InputStream input = new ByteArrayInputStream(bytes);
        
        int data;
        while ((data = input.read()) != -1) {
            System.out.print((char) data);
        }
    }
}