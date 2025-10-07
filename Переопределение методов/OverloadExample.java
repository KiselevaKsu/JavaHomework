public class OverloadExample {
    void print(int number) {
        System.out.println("Целое число: " + number);
    }
    
    void print(double number) {
        System.out.println("Дробное число: " + number);
    }
    
    void print(String text) {
        System.out.println("Текст: " + text);
    }
    
    void print(int number, String text) {
        System.out.println("Число: " + number + ", Текст: " + text);
    }
    
    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        example.print(10);
        example.print(3.14);
        example.print("Привет");
        example.print(5, "раз");
    }
}