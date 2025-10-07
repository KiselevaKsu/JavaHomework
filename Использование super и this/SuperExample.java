class Parent {
    String name = "Родитель";
    
    Parent(String name) {
        this.name = name;
    }
    
    void show() {
        System.out.println("Метод родителя: " + name);
    }
}

class Child extends Parent {
    String name = "Ребенок";
    
    Child() {
        super("Родитель из конструктора");
    }
    
    void display() {
        System.out.println("Поле родителя: " + super.name);
        super.show(); //метод родителя
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}