public class OutClass {
    private String privateField = "private";
    String defaultField = "default";  
    protected String protectedField = "protected";
    public String publicField = "public";
    
    private void privateMethod() { System.out.println("private method"); }
    void defaultMethod() { System.out.println("default method"); }
    protected void protectedMethod() { System.out.println("protected method"); }
    public void publicMethod() { System.out.println("public method"); }
    
    class InnerClass {
        public void accessAll() {
            // доступ ко всем полям внешнего класса
            System.out.println(privateField);    // private
            System.out.println(defaultField);    //  default  
            System.out.println(protectedField);  //  protected
            System.out.println(publicField);     //  public
            
            // вызов всех методов внешнего класса
            privateMethod();     //  private
            defaultMethod();     //  default
            protectedMethod();   //  protected  
            publicMethod();      //  public
        }
    }
}