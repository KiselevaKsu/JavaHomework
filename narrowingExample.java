public class NarrowingExample {
    public static void main(String[] args) {
        int i = 1000;
        byte b = (byte) i;  
        
        double d = 3.14;
        int i2 = (int) d; 
        
        long l = 123456789L;
        short s = (short) l;
    }
}