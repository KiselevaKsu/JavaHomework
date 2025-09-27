public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;
        boolean x = true, y = false;
        String s1 = "Hello", s2 = "World";
        
        // Присваивание
        a = 5;
        a += 2;
        a -= 1;
        a *= 3;
        a /= 2;
        a %= 4;
        
        // Арифметические
        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        int div = a / b;
        int mod = a % b;
        
        // Инкремент/декремент
        int preInc = ++a;
        int postInc = b++;
        int preDec = --a;
        int postDec = b--;
        
        // Сравнение
        boolean eq = a == b;
        boolean ne = a != b;
        boolean gt = a > b;
        boolean lt = a < b;
        
        // Логические
        boolean and = x && y;
        boolean or = x || y;
        boolean xor = x ^ y;
        boolean not = !x;
        
        // Побитовые
        int bitAnd = a & b;
        int bitOr = a | b;
        int bitXor = a ^ b;
        int bitNot = ~a;
        
        // Сдвиги
        int leftShift = a << 1;
        int rightShift = a >> 1;
        int unsignedRightShift = a >>> 1;
        
        // Строки
        String concat = s1 + " " + s2;
        s1 += " Java";
        
        // Тернарный оператор
        int max = (a > b) ? a : b;
    }
}
