interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default метод интерфейса");
    }

    static void staticMethod() {
        System.out.println("Static метод интерфейса");
    }
}

class MyClass implements MyInterface {
    // defaultMethod можно переопределить, но не обязательно
}

public class InterfaceExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // вызов default метода через объект класса
        obj.defaultMethod();
        
        // вызов static метода через интерфейс
        MyInterface.staticMethod();
        
        // нельзя вызвать static метод через объект:
        // obj.staticMethod(); // ОШИБКА
    }
}