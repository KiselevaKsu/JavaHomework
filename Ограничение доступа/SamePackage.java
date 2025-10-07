public class SamePackage { // в том же пакете
    public void test() {
        Example ex = new Example();
        System.out.println(ex.publicVar); 
        System.out.println(ex.defaultVar);     
        System.out.println(ex.protectedVar);  
        // ex.privateVar - не видно
    }
}
