public class EnumWithMethod {
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.calculate(5, 3));
    }
}

enum Operation {
    PLUS {
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    MINUS {
        public int calculate(int a, int b) {
            return a - b;
        }
    };
    
    public abstract int calculate(int a, int b);
}