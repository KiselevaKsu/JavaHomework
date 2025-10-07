public class InstanceofExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<Integer> intBox = new Box<>();
        
        System.out.println(stringBox instanceof Box); // true
        System.out.println(intBox instanceof Box);    // true
    }
}

class Box<T> {
    // private T item;
}