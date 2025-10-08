interface MyInterface {
    static class NestedClass {
        public void printMessage() {
            System.out.println("Метод вложенного класса в интерфейсе");
        }
    }
    
    void interfaceMethod();
}

class Implementation implements MyInterface {
    public void interfaceMethod() {
        System.out.println("Реализация метода интерфейса");
    }
}

public class InterfaceWithNested {
    public static void main(String[] args) {
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.printMessage();
        
        Implementation impl = new Implementation();
        impl.interfaceMethod();
    }
}