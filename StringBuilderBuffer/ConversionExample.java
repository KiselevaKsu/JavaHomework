public class ConversionExample {
    public static void main(String[] args) {
        // String to StringBuilder
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        
        // String to StringBuffer  
        StringBuffer sbf = new StringBuffer(str);
        
        // StringBuilder to String
        String fromSb = sb.toString();
        
        // StringBuffer to String
        String fromSbf = sbf.toString();
        
        // StringBuilder to StringBuffer (через String)
        StringBuffer sbfFromSb = new StringBuffer(sb.toString());
        
        // StringBuffer to StringBuilder (через String)
        StringBuilder sbFromSbf = new StringBuilder(sbf.toString());
        
        System.out.println("String: " + str);
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbf);
    }
}