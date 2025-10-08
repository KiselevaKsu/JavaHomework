public class OuterClass {
    private String outerField = "outer";
    
    // private inner class - только внутри OuterClass
    private class PrivateInner {
        void show() {
            System.out.println("Private: " + outerField); // видит поля внешнего класса
        }
    }
    
    // default inner class - виден в том же пакете
    class DefaultInner {
        void show() {
            System.out.println("Default: " + outerField);
        }
    }
    
    // protected inner class - виден в пакете + наследникам
    protected class ProtectedInner {
        void show() {
            System.out.println("Protected: " + outerField);
        }
    }
    
    // public inner class - виден везде
    public class PublicInner {
        void show() {
            System.out.println("Public: " + outerField);
        }
    }
    
    public void testInnerClasses() {
        PrivateInner pi = new PrivateInner(); // виден внутри OuterClass
        pi.show();
    }
}