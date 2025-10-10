public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            // ArithmeticException - деление на ноль
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Поймали ArithmeticException");
        }
        
        try {
            // ArrayIndexOutOfBoundsException - выход за границы массива
            int[] arr = {1, 2, 3};
            int x = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймали ArrayIndexOutOfBoundsException");
        }
        
        try {
            // IllegalArgumentException - неверный аргумент
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймали IllegalArgumentException");
        }
        
        try {
            // ClassCastException - неверное приведение типов
            Object obj = "строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Поймали ClassCastException");
        }
        
        try {
            // NullPointerException - обращение к null
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Поймали NullPointerException");
        }
    }
    
    static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}