public class StringMethodsExample {
    public static void main(String[] args) {
        String text = " Hello Java World ";
        
        //length() - длина строки
        System.out.println("Длина: " + text.length());
        
        //trim() - удаляет пробелы в начале и конце
        String trimmed = text.trim();
        System.out.println("Без пробелов: '" + trimmed + "'");
        
        //toUpperCase() - в верхний регистр
        System.out.println("Верхний регистр: " + text.toUpperCase());
        
        // toLowerCase() - в нижний регистр
        System.out.println("Нижний регистр: " + text.toLowerCase());
        
        // substring() - часть строки
        System.out.println("Подстрока: " + text.substring(7, 11));
        
        // replace() - замена символов
        System.out.println("Замена: " + text.replace('a', 'o'));
        
        // contains() - проверка содержания
        System.out.println("Содержит 'Java': " + text.contains("Java"));
        
        // split() - разделение на массив
        String[] words = trimmed.split(" ");
        System.out.println("Разделено на " + words.length + " слова");
        
        // equals() - сравнение строк
        System.out.println("Равно 'hello': " + text.equals("hello"));
        
        // charAt() - символ по индексу
        System.out.println("Символ на позиции 1: " + text.charAt(1));
    }
}