/* 
при объявлении:
public class A { 
    public final int a = 10;
} 
в конструкторе:
public class A {
    public final int a;
    
    public A() {
        a = 10;
    }
}
в блоке инициализации
public class A {
    public final int a;
    
    {
        a = 10;
    }
} 
через параемтр конструктора*/
public class ClassA {
    public final int a;
    
    public ClassA(int value) {
        a = value;
    }
}
// нельзя оставить без инициализации или инициализировать в обычном методе