class Animal{
    void makeSound(){
        System.out.println("Издаёт звук");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Мяу");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();
    }
}

// Если типы возвращаемых значений не совпадают - будет ошибка компиляции
// class Parent {
//     String getInfo() { return "Parent"; }
// }

// class Child extends Parent {
//     int getInfo() { return 10; } // ОШИБКА: несовместимые типы
// }