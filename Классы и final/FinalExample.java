class Parent{
    public final void finalMethod(){
        System.out.println("Это финальный метод");
    }
}

class Child extends Parent{
    // public void finalMethod(){
    //     System.out.println("Переопределение");
    // } ошибка
}

public class FinalExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.finalMethod(); // Вызовет метод родителя
    }
}