public class Printer {
    public static void print(int... numbers) {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    public static void print(String... texts) {
        for (String s : texts) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        print(1, 2, 3);           // вызовет print(int...)
        print("A", "B", "C");     // вызовет print(String...)
    }
}