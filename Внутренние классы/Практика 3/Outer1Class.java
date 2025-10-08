public class Outer1Class {
    
    class InnerClass {
        private String privateField = "private inner";
        String defaultField = "default inner";
        protected String protectedField = "protected inner"; 
        public String publicField = "public inner";
        
        private void privateMethod() { System.out.println("private inner method"); }
        void defaultMethod() { System.out.println("default inner method"); }
        protected void protectedMethod() { System.out.println("protected inner method"); }
        public void publicMethod() { System.out.println("public inner method"); }
    }
    
    public void testAccess() {
        InnerClass inner = new InnerClass();
        
        // System.out.println(inner.privateField);  ошибка компиляции
        System.out.println(inner.defaultField);       // default - видно
        System.out.println(inner.protectedField);     // protected - видно  
        System.out.println(inner.publicField);        //  public - видно
        
        // inner.privateMethod(); ошибка компиляции
        inner.defaultMethod();        // default - видно
        inner.protectedMethod();      //  protected - видно
        inner.publicMethod();         //  public - видно
    }
}