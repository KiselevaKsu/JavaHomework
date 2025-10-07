public class Test {
    public static void main(String[] args) {
        // через класс
        A.printVars();
        
        //через объект
        A obj = new A();
        obj.printVars();
        
        // из того же класса (если бы был в A)
        // printVars();
    }
}