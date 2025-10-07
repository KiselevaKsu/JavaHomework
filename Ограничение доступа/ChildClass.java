public class ChildClass extends Example{ //наследник в другом пакете
    public void test() {
        System.out.println(publicVar);    
        System.out.println(protectedVar); 
        // defaultVar - не видно
        // privateVar - не видно
    }
}
