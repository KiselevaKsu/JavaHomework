public class Main {
    public static void main(String[] args) {
        OutClass outer = new OutClass();
        OutClass.InnerClass inner = outer.new InnerClass();
        inner.accessAll(); 
    }
}