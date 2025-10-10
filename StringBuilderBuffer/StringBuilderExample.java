public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // append - добавляет в конец
        sb.append(" World");
        System.out.println("после append: " + sb);
        
        // insert - вставляет в указанную позицию
        sb.insert(5, " Java");
        System.out.println("после insert: " + sb);
        
        // delete - удаляет часть строки
        sb.delete(5, 10);
        System.out.println("после delete: " + sb);
        
        // reverse - переворачивает строку
        sb.reverse();
        System.out.println("после reverse: " + sb);
        
        // setCharAt - заменяет символ по индексу
        sb.setCharAt(0, 'h');
        System.out.println("после setCharAt: " + sb);
        
        // replace - заменяет часть строки
        sb.replace(0, 5, "Hello");
        System.out.println("после replace: " + sb);
        
        // length - возвращает длину
        System.out.println("длина: " + sb.length());
        
        // capacity - возвращает емкость
        System.out.println("емкость: " + sb.capacity());
        
        // ensureCapacity - гарантирует минимальную емкость
        sb.ensureCapacity(50);
        System.out.println("емкость после ensureCapacity: " + sb.capacity());
        
        // substring - возвращает часть строки
        String part = sb.substring(6, 11);
        System.out.println("substring: " + part);
        
        // StringBuffer работает так же, но потокобезопасный
        StringBuffer sbf = new StringBuffer("Buffer");
        sbf.append(" test");
        System.out.println("StringBuffer: " + sbf);
    }
}