import java.io.*;
import java.util.*;

public class FileReadExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("C:\\JAVAK\\Exceptions\\src\\test.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}