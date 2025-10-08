interface FirstInterface {
    default void show() {
        System.out.println("Метод из первого интерфейса");
    }
}

interface SecondInterface {
    default void show() {
        System.out.println("Метод из второго интерфейса");
    }
}

class MyClass implements FirstInterface, SecondInterface {
    // !!!переопределяем конфликтующий метод
    @Override
    public void show() {
        // Вариант 1: вызываем метод из конкретного интерфейса
        FirstInterface.super.show();
        
        // Вариант 2: пишем свою реализацию
    }
}

public class ConflictExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show(); // выведет "Метод из первого интерфейса"
    }
}