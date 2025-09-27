/**
 * Класс для демонстрации работы с числами
 * @author Ксения
 * @version 1.0
 */
public class Calculator {
    
    /**
     * Метод сложения двух чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     * @see #multiply(int, int)
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Метод умножения двух чисел
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b
     */
    public int multiply(int a, int b) {
        return a * b;
    }
}