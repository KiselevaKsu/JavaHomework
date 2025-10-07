final class FinalClass {
    public void show() {
        System.out.println("Финальный класс");
    }
}

// class ChildClass extends FinalClass {
//     public void display() {
//         System.out.println("Дочерний класс");
//     }
// } Ошбика 

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}