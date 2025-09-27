class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal animal = new Animal();
        Object nullObj = null;

        boolean b1 = dog instanceof Animal;    // true (Dog -> Animal)
        boolean b2 = dog instanceof Dog;       // true
        boolean b3 = dog instanceof Cat;       // false

        boolean b4 = nullObj instanceof Animal; // false (null не экземпляр)
        boolean b5 = null instanceof String;    // false
        
        // Object и наследование
        boolean b6 = cat instanceof Object;     // true (все классы от Object)
    }
}