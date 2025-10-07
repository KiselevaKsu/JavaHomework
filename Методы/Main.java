public class Main {
    public static void main(String[] args) {
        // перегрузка
        Calculator calc = new Calculator();
        calc.add(2, 3);      // вызовет int add
        calc.add(2.5, 3.5);  // вызовет double add
        
        // Переопределение
        Animal cat = new Cat();
        cat.sound();  // вызовется метод Cat
    }
}
