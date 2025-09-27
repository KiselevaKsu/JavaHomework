public class operatotSwitch {
    public static void main(String[] args) {
        int i = 1; //int и совместимые (byte,short,char)
        switch(i) {}
        
        String s = "hello"; 
        switch(s) {}
        
        enum Color {RED} //enum
        Color c = Color.RED;
        switch(c) {}
        
        Integer n = 1; // Integer, Byte, Short, Character
        switch(n) {}
    }
}

