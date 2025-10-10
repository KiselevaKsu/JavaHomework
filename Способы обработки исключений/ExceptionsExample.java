public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Перехватили деление на ноль");
        }
        
        String str = null;
        str.length(); // NullPointerException
    }
}