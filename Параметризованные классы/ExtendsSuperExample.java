import java.util.*;

public class ExtendsSuperExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        
        // extends - читаем числа
        printList(numbers);
        
        // super - добавляем числа
        addNumber(numbers);
    }
    
    static void printList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }
    
    static void addNumber(List<? super Integer> list) {
        list.add(123);
    }
}