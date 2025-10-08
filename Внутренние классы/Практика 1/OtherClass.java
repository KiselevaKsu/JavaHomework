public class OtherClass { //в том же пакете, что и OuterClass
    public void test() {
        OuterClass outer = new OuterClass();
        
        // OuterClass.PrivateInner pi = outer.new PrivateInner(); // не виден
        OuterClass.DefaultInner di = outer.new DefaultInner();    //  виден (один пакет)
        OuterClass.ProtectedInner pri = outer.new ProtectedInner(); //  виден (один пакет)
        OuterClass.PublicInner pui = outer.new PublicInner();     //  виден везде
    }
}