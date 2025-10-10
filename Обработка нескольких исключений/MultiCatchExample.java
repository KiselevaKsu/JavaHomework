class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class MultiCatchExample {
    public static void main(String[] args) {
        // несколько исключений обрабатываются одинаково
        try {
            int random = (int)(Math.random() * 3);
            if (random == 0) throw new NullPointerException();
            if (random == 1) throw new IllegalArgumentException();
            if (random == 2) throw new ArithmeticException();
        } catch (NullPointerException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Одинаковая обработка для всех трех исключений");
        }
        
        // исключения в иерархии
        try {
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Поймали Ex3");
        } catch (Ex2 e) {
            System.out.println("Поймали Ex2");
        } catch (Ex1 e) {
            System.out.println("Поймали Ex1");
        }
    }
}