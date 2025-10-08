class Parent {
    void show() {
        System.out.println("Parent");
    }
    
    @Deprecated //помечает устаревший метод
    void oldMethod() {
        System.out.println("Устаревший метод");
    }
}

class Child extends Parent {
    @Override //указывает, что метод переопределяет метод суперкласса
    void show() {
        System.out.println("Child");
    }
}

public class AnnotationsExample {
    @SuppressWarnings("deprecation") //отключает предупреждения компилятора
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
        
        // предупреждение подавлено @SuppressWarnings
        child.oldMethod();
    }
}