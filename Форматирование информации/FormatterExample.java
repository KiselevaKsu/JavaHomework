public class FormatterExample {
    public static void main(String[] args) {
        String name = "Ксения";
        int age = 20;
        double height = 1.61;
        boolean isStudent = true;
        char grade = 'A';
        
        // %s - строковое значение
        System.out.printf("Имя: %s%n", name);
        
        // %d - целое число
        System.out.printf("Возраст: %d лет%n", age);
        
        // %f - дробное число
        System.out.printf("Рост: %.2f м%n", height);
        
        // %b - логическое значение
        System.out.printf("Студент: %b%n", isStudent);
        
        // %c - символ
        System.out.printf("Оценка: %c%n", grade);
    }
}