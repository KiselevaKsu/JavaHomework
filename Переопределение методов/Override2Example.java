class Parent {
    public void showMessage() {
        System.out.println("Сообщение из родителя");
    }
}

class Child extends Parent {
    // @Override
    // public void showMessag() {  // ошибка: опечатка в имени метода!
    //     System.out.println("Сообщение из ребенка");
    // }
}

public class Override2Example {
    public static void main(String[] args) {
        Child child = new Child();
        child.showMessage(); // Вызовет метод родителя, а не ребенка(тк не переопредилось, если без override(закомменченно))
    }
}